package com.natashapetrenko.cafe.repository;

import com.natashapetrenko.cafe.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface CrudOrderRepository extends JpaRepository<Order, Integer> {

    @Override
    Optional<Order> findById(Integer id);

    @Override
    @Transactional
    Order save(Order order);
}
