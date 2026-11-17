package com.pluralsight;
import java.math.BigDecimal;
import java.time.Year;

public class Vehicle extends Asset {

        // Properties
        private String makeModel;
        private int year;
        private int odometer;

        // Constructor
        public Vehicle(String description, String dateAcquired,
                       BigDecimal originalCost, String makeModel,
                       int year, int odometer) {

            super(description, dateAcquired, originalCost);

            this.makeModel = makeModel;
            this.year = year;
            this.odometer = odometer;
        }

        // Getters and Setters
        public String getMakeModel() {
            return makeModel;
        }

        public void setMakeModel(String makeModel) {
            this.makeModel = makeModel;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getOdometer() {
            return odometer;
        }

        public void setOdometer(int odometer) {
            this.odometer = odometer;
        }

        @Override
        public BigDecimal getValue() {

            int currentYear = Year.now().getValue();
            int age = currentYear - year;

            BigDecimal value = getOrignalCost();

            if (age <= 3) {
                value = value.multiply(new BigDecimal("0.97").pow(age));

            } else if (age <= 6) {
                value = value.multiply(new BigDecimal("0.94").pow(age));

            } else if (age <= 10) {
                value = value.multiply(new BigDecimal("0.92").pow(age));

            } else {
                value = new BigDecimal("1000");
            }

            // Check mileage
            if (odometer > 100000
                    && !makeModel.toLowerCase().contains("honda")
                    && !makeModel.toLowerCase().contains("toyota")) {

                value = value.multiply(new BigDecimal("0.75"));
            }

            return value;
        }
    }

