/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Inventory;
import model.Weapon;
import java.util.Scanner;

/**
 *
 * @author Iman
 */
public class ConsoleView {

    private Scanner scanner = new Scanner(System.in);

    public void displayInventory(Inventory inventory) {
        System.out.println("*** Inventory ***       Balance: $" +  inventory.getBalance());

        for (Weapon weapon : inventory.getWeapons()) {
            System.out.println(weapon.getName() + " - " + weapon.getType() + " - $" + weapon.getPrice());
        }

    }

    public void displayWeapons(List<Weapon> weapons) {
        System.out.println("*** Weapons ***");

        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName() + " - " + weapon.getType() + " - $" + weapon.getPrice());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine().trim();
    }
}
