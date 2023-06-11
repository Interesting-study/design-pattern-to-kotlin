package com.gof.pattern.factoryMethod.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private String orderType;
    private String item;
    private String price;
}
