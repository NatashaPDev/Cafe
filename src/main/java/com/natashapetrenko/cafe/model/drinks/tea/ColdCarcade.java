package com.natashapetrenko.cafe.model.drinks.tea;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class ColdCarcade extends Tea {
}
