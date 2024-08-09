/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Iman
 */
public class User   {

    private String username;
    private Inventory inventory;

    public User(String username, Inventory inventory) {
        this.username = username;
        this.inventory = inventory;
    }

    public String getUsername() {
        return username;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
