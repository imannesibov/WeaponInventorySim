/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Iman
 */
public class Inventory {

    private List<Weapon> weapons;
    private double balance;
  

    public Inventory(List<Weapon> weapons, int balance) {
        this.weapons = weapons;
        this.balance = balance;
    }
   

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
   
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
