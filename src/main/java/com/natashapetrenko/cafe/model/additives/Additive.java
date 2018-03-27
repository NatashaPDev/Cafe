package com.natashapetrenko.cafe.model.additives;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.natashapetrenko.cafe.model.AbstractItem;

import javax.persistence.*;

@Entity
@Table(name = "additives")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "class")
public abstract class Additive extends AbstractItem {
}
