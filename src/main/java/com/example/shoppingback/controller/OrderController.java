package com.example.shoppingback.controller;

import com.example.shoppingback.dto.OrderDTO;
import com.example.shoppingback.dto.ResponseDTO;
import com.example.shoppingback.entity.Order;
import com.example.shoppingback.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/order")
    public ResponseEntity<?> order(@AuthenticationPrincipal String userId,@RequestBody OrderDTO orderDto){
        log.info("주문하기 생성");
        Long orderId;
        try {
            orderId = orderService.order(orderDto, userId);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Long>(orderId, HttpStatus.OK);
    }
}
