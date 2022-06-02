/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.List;

/**
 *
 * @author ziadz
 */
class Product {
    private String ProductName;
    private String ProductID;
    private Double ProductCost;
    

    public Product(String ProductName, String ProductID, Double ProductCost) {
        this.ProductName = ProductName;
        this.ProductID = ProductID;
        this.ProductCost = ProductCost;
    }
    
    

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public Double getProductCost() {
        return ProductCost;
    }

    public void setProductCost(Double ProductCost) {
        this.ProductCost = ProductCost;
    }

//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//    
    
}
