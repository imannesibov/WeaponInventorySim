/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Iman
 */
public class Weapon {

    private String name;
    private String type;
    private double price;

    public Weapon(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return Objects.equals(name, weapon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    
    
}
