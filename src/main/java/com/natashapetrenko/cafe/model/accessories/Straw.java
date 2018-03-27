package com.natashapetrenko.cafe.model.accessories;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ST")
public class Straw extends Accessory {

}
