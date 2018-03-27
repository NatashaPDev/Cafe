package com.natashapetrenko.cafe.model.drinks.tea;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GT")
public class GreenTea extends Tea {
}
