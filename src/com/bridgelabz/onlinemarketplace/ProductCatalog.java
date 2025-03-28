package com.bridgelabz.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<? extends ProductCategory>> productCatalog = new ArrayList<>();

    public void addProduct(Product<? extends ProductCategory> product) {
        productCatalog.add(product);
    }

    public void displayProductCatalog() {
        System.out.println("Product Catalog:");
        for (Product<? extends ProductCategory> product : productCatalog) {
            System.out.println(product);
        }
    }

    public List<Product<? extends ProductCategory>> getProductCatalog() {
        return productCatalog;
    }
}