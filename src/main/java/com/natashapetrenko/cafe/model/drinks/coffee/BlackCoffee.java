package com.natashapetrenko.cafe.model.drinks.coffee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BC")
public class BlackCoffee extends Coffee {
}
