package com.natashapetrenko.cafe.web;

import com.natashapetrenko.cafe.model.Order;
import com.natashapetrenko.cafe.repository.CrudOrderRepository;
import com.natashapetrenko.cafe.to.OrderTo;
import com.natashapetrenko.cafe.util.OrdersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Objects;

@RestController
@RequestMapping(OrderRestController.REST_URL)
public class OrderRestController {

    static final String REST_URL = "/cafe/rest/orders";

    private CrudOrderRepository repository;

    @Autowired
    public void setRepository(CrudOrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public OrderTo get(@PathVariable("id") int id) {
        return OrdersUtil.createOrderTo(Objects.requireNonNull(repository.findById(id).orElse(null)));
    }

    @PostMapping
    public ResponseEntity<Order> createWithLocation(@RequestBody Order order) {

        order.getItems().forEach(item -> item.setOrder(order));
        Order created = repository.save(order);

        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(REST_URL + "/{id}")
                .buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uriOfNewResource).body(created);
    }
}