package com.annotation.core;

import com.annotation.Factory;

@Factory(
        id = "Cheese",
        type = Pizza.class
)
public class CheesePizza implements Pizza {

    @Override
    public float getPrice() {
        return 8.5f;
    }
}
