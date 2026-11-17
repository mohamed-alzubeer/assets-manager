package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AssetApp {
    public static void main(String[] args) {

        House house1 = new House("Family House", "10/20/2026", new BigDecimal("500000"), "123 Sagebrtuhs trial", 1,300,7000);
        House house2 = new House("My Vacation House", "05/15/2023", new BigDecimal("350000"), "456 Beach Road", 2, 2000, 8000);

        Vehicle vehicle1= new Vehicle("Tom's Truck", "03/10/2021", new BigDecimal("45000"), "Ford F-150", 2021, 75000);
        Vehicle vehicle2 = new Vehicle("My Car", "06/12/2023", new BigDecimal("30000"), "Toyota Camry", 2023, 50000);
        //print all house information - for test
        System.out.println("===== HOUSE INFORMATION For Test=====");
        System.out.println("Description: " + house1.getDescription());
        System.out.println("Date Acquired: " + house1.getDateAcquired());
        System.out.println("Original Cost: $" + house1.getOrignalCost());
        System.out.println("Address: " + house1.getAddress());
        System.out.println("Condition: " + house1.getCondition());
        System.out.println("Square Foot: " + house1.getSquareFoot());
        System.out.println("Lot Size: " + house1.getLotSize());
        System.out.println("\n=============The Test fished=============\n");

        //create Arraylist for Assets

        ArrayList<Asset> myAssets = new ArrayList<>();
        myAssets.add(house1);
        myAssets.add(house2);
        myAssets.add(vehicle1);
        myAssets.add(vehicle2);
        //display the number of assets
        System.out.println("Total Assets: " + myAssets.size());

        // Loop through all assets
        for (Asset asset : myAssets) {

            System.out.println("\n==============================");

            // Display common Asset information
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOrignalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Check the type of asset
            String message = "";

            if (asset instanceof House) {

                House house = (House) asset;

                message = "House Address: " + house.getAddress();

            } else if (asset instanceof Vehicle) {

                Vehicle vehicle = (Vehicle) asset;

                message = "Vehicle: " + vehicle.getYear()
                        + " " + vehicle.getMakeModel();
            }

            System.out.println(message);
        }

        System.out.println("==============================");




    }
}
