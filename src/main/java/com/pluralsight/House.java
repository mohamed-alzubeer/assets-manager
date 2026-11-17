package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {

    //properties
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //Methods- constructor
    public House(String description, String dateAcquired, BigDecimal orignalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, orignalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //Mehods- getters and setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    // A house's value is determined as
    // $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size

    //override all getValue()
    @Override
    public BigDecimal getValue() {

        BigDecimal valuePerSqureFoot;

        if (condition == 1) {
            valuePerSqureFoot = new BigDecimal("180");

        } else if (condition == 2) {
            valuePerSqureFoot = new BigDecimal("130");

        } else if (condition == 3) {
            valuePerSqureFoot = new BigDecimal("90");

        } else if (condition == 4) {
            valuePerSqureFoot = new BigDecimal("80");

        } else {
            throw new IllegalArgumentException("Invalid house condition");
        }

        // Calculate the house value
        BigDecimal houseValue = valuePerSqureFoot.multiply(
                BigDecimal.valueOf(squareFoot)
        );

        // Calculate the lot value
        BigDecimal lotValue = new BigDecimal("0.25")
                .multiply(BigDecimal.valueOf(lotSize));

        // Return the total value
        return houseValue.add(lotValue);
    }
    }

