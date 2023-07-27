/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amyde
 */
public class Store {
    private String name;
    private Inventory inventory;

    public Store(String name) {
        this.name = name;
        inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
