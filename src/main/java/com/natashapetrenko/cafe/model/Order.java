package com.natashapetrenko.cafe.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.natashapetrenko.cafe.model.accessories.Accessory;
import com.natashapetrenko.cafe.model.additives.Additive;
import com.natashapetrenko.cafe.model.drinks.Drink;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order extends AbstractBaseEntity {

    @Entity
    @Table(name = "order_items")
    @Getter
    @Setter
    public static class Item extends AbstractBaseEntity {

        @ManyToOne
        @JoinColumn(name = "order_id")
        @JsonIgnore
        private Order order;

        @ManyToOne
        @JoinColumn(name = "drink_id")
        private Drink drink;

        @OneToMany
        @JoinTable(name = "order_item_additives", joinColumns = @JoinColumn(name = "order_item_id"),
                inverseJoinColumns = @JoinColumn(name = "item_id"))
        private List<Additive> additives;

        @OneToMany
        @JoinTable(name = "order_item_accessories", joinColumns = @JoinColumn(name = "order_item_id"),
                inverseJoinColumns = @JoinColumn(name = "item_id"))
        private List<Accessory> accessories;

    }

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "order")
    private List<Item> items;

    public int getTotal() {
        return items.stream()
                .mapToInt(item -> item.getDrink().getPrice()
                        + item.getAdditives().stream().mapToInt(AbstractItem::getPrice).sum()
                        + item.getAccessories().stream().mapToInt(AbstractItem::getPrice).sum())
                .sum();
    }
}

