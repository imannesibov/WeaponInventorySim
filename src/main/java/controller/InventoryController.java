/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.User;
import model.Weapon;
import service.MockDatabase;
import view.ConsoleView;

/**
 *
 * @author Iman
 */
public class InventoryController {

    private MockDatabase database;
    private ConsoleView view;

    public InventoryController(MockDatabase database, ConsoleView view) {
        this.database = database;
        this.view = view;
    }

    public void showInventory() {
        User user = database.getUser();
        view.displayInventory(user.getInventory());
    }

    public void showWeapons() {
        List<Weapon> weapons = database.getWeapons();
        view.displayWeapons(database.getWeapons());
    }

    public void buyWeapon(String weaponName) {

        User user = database.getUser();

        Weapon weaponToCheck = null;
        for (Weapon w : database.getWeapons()) {
            if (w.getName().equalsIgnoreCase(weaponName)) {
                weaponToCheck = w;
                break;
            }
        }

// Make weaponToCheck final for use in the lambda expression
        final Weapon finalWeaponToCheck = weaponToCheck;

        boolean userHasWeapon = user.getInventory().getWeapons().stream()
                .anyMatch(w -> finalWeaponToCheck != null && w.equals(finalWeaponToCheck));

        if (userHasWeapon) {
            System.out.println("You already have this weapon.");
        } else if (finalWeaponToCheck == null) {
            System.out.println("The weapon not found.");
        } else if (user.getInventory().getBalance() >= finalWeaponToCheck.getPrice()) {
            user.getInventory().addWeapon(finalWeaponToCheck);
            user.getInventory().setBalance(user.getInventory().getBalance() - finalWeaponToCheck.getPrice());
            view.displayMessage("Weapon purchased: " + weaponName);
        } else {
            view.displayMessage("Payment failed due to insufficient balance. Unable to purchase the weapon: " + weaponName);
        }
    }

}
