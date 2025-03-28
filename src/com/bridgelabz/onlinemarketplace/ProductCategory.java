package com.bridgelabz.onlinemarketplace;

public class ProductCategory {
    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category: " + getCategoryName();
    }
}

class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Book");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory() {
        super("Gadget");
    }
}