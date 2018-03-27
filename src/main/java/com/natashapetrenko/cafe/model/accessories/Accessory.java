package com.natashapetrenko.cafe.model.accessories;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.natashapetrenko.cafe.model.AbstractItem;

import javax.persistence.*;

@Entity
@Table(name = "accessories")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "class")
public abstract class Accessory extends AbstractItem {
}