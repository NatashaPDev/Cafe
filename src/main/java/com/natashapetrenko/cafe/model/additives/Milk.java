package com.natashapetrenko.cafe.model.additives;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ML")
public class Milk extends Additive implements Milky {
}
