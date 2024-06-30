package com.tiagocordeiro.course.repositories;

import com.tiagocordeiro.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
