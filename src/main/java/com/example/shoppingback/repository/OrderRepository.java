package com.example.shoppingback.repository;

import com.example.shoppingback.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
