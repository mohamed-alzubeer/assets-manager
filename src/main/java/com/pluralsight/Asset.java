package com.pluralsight;

import java.math.BigDecimal;

public class Asset {
    //properties
    private String description;
    private String dateAcquired;
    private BigDecimal orignalCost;

    //constructor
    public Asset(String description, String dateAcquired, BigDecimal orignalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.orignalCost = orignalCost;
    }

    //Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOrignalCost() {
        return orignalCost;
    }

    public void setOrignalCost(BigDecimal orignalCost) {
        this.orignalCost = orignalCost;
    }

    //Methods
    public BigDecimal getValue() {
        return orignalCost;
    }

}
