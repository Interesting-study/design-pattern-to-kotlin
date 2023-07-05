package com.gof.pattern.factoryMethod.after;

import com.gof.pattern.abstractFactory.after.Anchor;
import com.gof.pattern.abstractFactory.after.Wheel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {
    private String name;

    private String color;

    private String logo;

    private Anchor anchor;

    private Wheel wheel;
}
