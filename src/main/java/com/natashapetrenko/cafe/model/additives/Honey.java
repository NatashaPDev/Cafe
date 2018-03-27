package com.natashapetrenko.cafe.model.additives;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("HN")
public class Honey extends Additive implements Sugary {
}
