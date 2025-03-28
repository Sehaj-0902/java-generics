package com.bridgelabz.onlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product<BookCategory> book1 = new Product<>("Data Structures and Algorithms", 499.0, new BookCategory());
        Product<ClothingCategory> clothing1 = new Product<>("Jacket", 1990.0, new ClothingCategory());
        Product<GadgetCategory> gadget1 = new Product<>("Smartphone", 54999.0, new GadgetCategory());

        catalog.addProduct(book1);
        catalog.addProduct(clothing1);
        catalog.addProduct(gadget1);

        System.out.println("\nOriginal Catalog:");
        catalog.displayProductCatalog();

        System.out.println("\nApply Discounts:");
        DiscountUtils.applyDiscount(book1, 10);
        DiscountUtils.applyDiscount(clothing1, 20);
        DiscountUtils.applyDiscount(gadget1, 5);

        System.out.println("\nDiscounted Catalog:");
        catalog.displayProductCatalog();
    }
}