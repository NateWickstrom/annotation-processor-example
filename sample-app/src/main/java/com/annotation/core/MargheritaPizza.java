package com.annotation.core;

import com.annotation.Factory;

@Factory(
        id = "Margherita",
        type = Pizza.class
)
public class MargheritaPizza implements Pizza {

    @Override public float getPrice() {
        return 6f;
    }
}
