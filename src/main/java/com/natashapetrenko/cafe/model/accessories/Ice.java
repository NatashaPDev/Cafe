package com.natashapetrenko.cafe.model.accessories;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("IC")
public class Ice extends Accessory {
}
