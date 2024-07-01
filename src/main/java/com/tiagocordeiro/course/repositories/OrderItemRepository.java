package com.tiagocordeiro.course.repositories;

import com.tiagocordeiro.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
