package com.bridgelabz.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseSystem {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E001", "Laptop"));
        electronicsStorage.addItem(new Electronics("E002", "Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("G001", "Apples"));
        groceriesStorage.addItem(new Groceries("G002", "Bread"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F001", "Chair"));
        furnitureStorage.addItem(new Furniture("F002", "Table"));

        System.out.println("Electronics Storage:");
        displayAllItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        displayAllItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        displayAllItems(furnitureStorage.getItems());

        System.out.println("\nAll Items:");

        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceriesStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());

        displayAllItems(allItems);

        System.out.println("\nRemove item F001");
        furnitureStorage.removeItem("F001");

        System.out.println("\nFurniture Storage after removal:");
        displayAllItems(furnitureStorage.getItems());
    }
}