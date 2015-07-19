package com.annotation.core;

import com.annotation.Factory;

@Factory(
        id = "Pepperoni",
        type = Pizza.class
)
public class PepperoniPizza implements Pizza {

    @Override public float getPrice() {
        return 4.5f;
    }
}
