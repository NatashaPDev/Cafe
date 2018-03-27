package com.natashapetrenko.cafe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractItem extends AbstractBaseEntity {

    @Column(name = "name")
    protected String name;

    @Column(name = "price")
    protected int price;
}
