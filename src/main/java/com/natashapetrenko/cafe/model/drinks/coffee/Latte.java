package com.natashapetrenko.cafe.model.drinks.coffee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LT")
public class Latte extends Coffee {
}
