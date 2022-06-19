
/*
 * @author irumvanselme - irumvanselme@outlook.com
 * Copyright (c) 2022.
 */

package com.okavaa.anselme;


final public class Currency {

    private final String name;

    private final String abbreviation;

    private final Double averagedCost;

    private final Registerer registerer;

    public Currency(String name, String abbreviation, Double averagedCost, Registerer registerer) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.averagedCost = averagedCost;
        this.registerer = registerer;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public Double getAveragedCost() {
        return averagedCost;
    }

    public Registerer getRegisterer() {
        return registerer;
    }
}
