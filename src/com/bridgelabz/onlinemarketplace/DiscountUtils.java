package com.bridgelabz.onlinemarketplace;

public class DiscountUtils {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Discount applied: " + product);
    }
}