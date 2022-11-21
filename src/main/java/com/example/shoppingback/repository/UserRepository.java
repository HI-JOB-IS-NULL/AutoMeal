package com.example.shoppingback.repository;

import com.example.shoppingback.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {//Entitu 타입 정보와 기본키의 자료형 지정

    User findByUserEmail(String userEmail);
    Boolean existsByUserEmail(String userEmail);

}