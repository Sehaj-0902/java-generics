package com.bridgelabz.smartwarehouse;

abstract class WarehouseItem {
    private String itemName;

    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Item: " + itemName;
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Electronics - " + super.toString();
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Groceries - " + super.toString();
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Furniture - " + super.toString();
    }
}