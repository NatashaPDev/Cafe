package com.natashapetrenko.cafe.model.drinks.coffee;

import com.natashapetrenko.cafe.model.drinks.Drink;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Coffee extends Drink {

    protected int caffeineLevel;
}
