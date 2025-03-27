package com.bridgelabz.smartwarehouse;

abstract class WarehouseItem {
    private String itemId;
    private String itemName;

    public WarehouseItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Item ID: " + getItemId() + ", Item Name: " + getItemName();
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String toString() {
        return "Electronics - " + super.toString();
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String toString() {
        return "Groceries - " + super.toString();
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String toString() {
        return "Furniture - " + super.toString();
    }
}