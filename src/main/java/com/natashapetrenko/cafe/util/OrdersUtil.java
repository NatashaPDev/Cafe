package com.natashapetrenko.cafe.util;

import com.natashapetrenko.cafe.model.Order;
import com.natashapetrenko.cafe.to.OrderTo;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class OrdersUtil {

    public static OrderTo createOrderTo(Order order) {

        List<OrderTo.ItemTo> items = order.getItems().stream()
                .map(OrdersUtil::createItemTo)
                .collect(toList());

        return new OrderTo(items, order.getTotal());
    }

    private static OrderTo.ItemTo createItemTo(Order.Item item) {

        return new OrderTo.ItemTo(item.getDrink(), item.getAdditives(), item.getAccessories());
    }
}
