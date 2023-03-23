package com.exchange.type.util;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Discount {

    LEVEL1(0.05, "RECURRENTE 1"),
    LEVEL2(0.02, "RECURRENTE 2"),
    LEVEL3(0.01, "RECURRENTE 3"),
    LEVEL4(0.1, "RECURRENTE 4");

    private final double value;

    private final String description;

    public double getValue() { return value; }

    public String getDescription() { return description; }
}
