package com.natashapetrenko.cafe.model.additives;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SG")
public class Sugar extends Additive implements Sugary {
}
