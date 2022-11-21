package com.example.shoppingback.repository;

import com.example.shoppingback.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
