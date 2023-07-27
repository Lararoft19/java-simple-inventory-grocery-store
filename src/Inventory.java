/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amyde
 */

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Product> products;
    private final ArrayList<Order> orders;

    public Inventory() {
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
