package com.example.shoppingback.repository;

import com.example.shoppingback.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {
}
