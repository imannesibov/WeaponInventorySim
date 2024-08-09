/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import controller.InventoryController;
import service.MockDatabase;
import view.ConsoleView;

/**
 *
 * @author Iman
 */


public class WeaponInventorySim {

    private static final ConsoleView view = new ConsoleView();
    private static final MockDatabase database = MockDatabase.getInstance();
    private static final InventoryController controller = new InventoryController(database, view);

    public static void main(String[] args) throws Exception {
        displayWelcomeMessage();
        runInventoryManagement();
        displayExitMessage();
    }

    private static void displayWelcomeMessage() {
        view.displayMessage("Welcome to Weapon Inventory Management!");
    }

    private static void runInventoryManagement() {
        boolean running = true;
        while (running) {
            view.displayMessage("\nOptions:");
            view.displayMessage("1. Show Inventory");
            view.displayMessage("2. Buy Weapon");
            view.displayMessage("3. Exit");

            String choice = view.getInput("Enter your choice:");

            switch (choice) {
                case "1":
                    controller.showInventory();
                    break;
                case "2":
                    controller.showWeapons();
                    String weaponName = view.getInput("Enter the name of the weapon to buy:");
                    controller.buyWeapon(weaponName);
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    view.displayMessage("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private static void displayExitMessage() {
        view.displayMessage("Thank you for using Weapon Inventory Management. Goodbye!");
    }
}
