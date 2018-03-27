package com.natashapetrenko.cafe.model.accessories;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("UM")
public class Umbrella extends Accessory {
}
