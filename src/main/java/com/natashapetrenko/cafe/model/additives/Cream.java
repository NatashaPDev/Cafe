package com.natashapetrenko.cafe.model.additives;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CR")
public class Cream extends Additive implements Milky {
}
