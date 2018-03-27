package com.natashapetrenko.cafe.to;

import com.natashapetrenko.cafe.model.accessories.Accessory;
import com.natashapetrenko.cafe.model.additives.Additive;
import com.natashapetrenko.cafe.model.drinks.Drink;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderTo {

    @Getter
    @Setter
    public static class ItemTo {

        private Drink drink;
        private List<Additive> additives;
        private List<Accessory> accessories;

        public ItemTo(Drink drink, List<Additive> additives, List<Accessory> accessories) {
            this.drink = drink;
            this.additives = additives;
            this.accessories = accessories;
        }
    }

    private List<ItemTo> items;
    private int total;

    public OrderTo(List<ItemTo> items, int total) {
        this.items = items;
        this.total = total;
    }
}
