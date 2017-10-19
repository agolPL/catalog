package com.redcar.catalog.domain;

import lombok.Getter;

@Getter
class Car {

    private final String name;

    Car(String name) {
        this.name = name;
    }
}
