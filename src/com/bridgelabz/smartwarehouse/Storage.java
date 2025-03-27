package com.bridgelabz.smartwarehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Storage<T extends WarehouseItem> {
    private Map<String, T> items = new HashMap<>();

    public void addItem(T item) {
        items.put(item.getItemId(), item);
    }

    public T getItem(String itemId) {
        return items.get(itemId);
    }

    public List<T> getItems() {
        return new ArrayList<>(items.values());
    }

    public int size() {
        return items.size();
    }

    public void removeItem(String itemId) {
        items.remove(itemId);
    }
}