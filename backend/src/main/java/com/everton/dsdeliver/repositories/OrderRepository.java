package com.everton.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

