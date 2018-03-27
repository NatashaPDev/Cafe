package com.natashapetrenko.cafe.model.drinks.coffee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ES")
public class Espresso extends Coffee {
}
