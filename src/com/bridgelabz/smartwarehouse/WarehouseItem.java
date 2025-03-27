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