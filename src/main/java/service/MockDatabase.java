package service;

import java.util.ArrayList;
import java.util.List;
import model.Inventory;
import model.User;
import model.Weapon;

public class MockDatabase {

    private static MockDatabase instance;
    private List<Weapon> weapons;
    private User user;

    // Private constructor to prevent instantiation from outside
    private MockDatabase() {
        weapons = new ArrayList<>();
        initializeMockData();
    }

    // Singleton pattern to ensure only one instance exists
    public static MockDatabase getInstance() {
        if (instance == null) {
            instance = new MockDatabase();
        }
        return instance;
    }

    // Initialize mock data for weapons and user
    private void initializeMockData() {

        // Initialize weapons 
        weapons.add(new Weapon("Ranger-47", "Assault Rifle", 3000));
        weapons.add(new Weapon("Phantom", "Sniper Rifle", 4500));
        weapons.add(new Weapon("Viper-M1", "Assault Rifle", 3800));
        weapons.add(new Weapon("Viper-X4", "Assault Rifle", 2500));
        weapons.add(new Weapon("Falcon-19", "Pistol", 200));
        weapons.add(new Weapon("Spectre-S", "Pistol", 200));
        weapons.add(new Weapon("Desert Hawk", "Pistol", 700));
        weapons.add(new Weapon("Viper-Seven", "Pistol", 450));
        weapons.add(new Weapon("Strike-9", "Pistol", 250));
        weapons.add(new Weapon("Talon-9", "Pistol", 500));
        weapons.add(new Weapon("Raptor-10", "SMG", 1200));
        weapons.add(new Weapon("Hornet-P9", "SMG", 1100));
        weapons.add(new Weapon("Stinger-45", "SMG", 1000));
        weapons.add(new Weapon("Basilisk", "SMG", 1600));
        weapons.add(new Weapon("Panther-90", "SMG", 2200));
        weapons.add(new Weapon("Griffin AR", "Assault Rifle", 2700));
        weapons.add(new Weapon("Lynx", "Assault Rifle", 2100));
        weapons.add(new Weapon("Rogue 08", "Sniper Rifle", 1900));
        weapons.add(new Weapon("Hawk-553", "Assault Rifle", 2100));
        weapons.add(new Weapon("Phoenix", "Assault Rifle", 9500));
        weapons.add(new Weapon("Marauder", "Shotgun", 3150));
        weapons.add(new Weapon("Revenant-XM", "Shotgun", 1100));
        weapons.add(new Weapon("Reaper", "Shotgun", 1250));
        weapons.add(new Weapon("Spectre-7", "Shotgun", 1500));
        weapons.add(new Weapon("Goliath", "Machine Gun", 5500));
        weapons.add(new Weapon("Juggernaut", "Machine Gun", 1900));

        // Additional items 
        weapons.add(new Weapon("Flare Bomb", "Grenade", 250));
        weapons.add(new Weapon("Blaze Bomb", "Grenade", 350));
        weapons.add(new Weapon("Shadow Grenade", "Grenade", 450));
        weapons.add(new Weapon("Molten Blast", "Grenade", 550));
        weapons.add(new Weapon("Echo Grenade", "Grenade", 200));
        weapons.add(new Weapon("Thunderbolt", "Taser", 90));

        // Initialize user (simulate a single user)
        user = new User("Monsta Killa", new Inventory(new ArrayList<>(), 10000)); // Example initial balance and username

    }

    // Getter for retrieving the list of weapons
    public List<Weapon> getWeapons() {
        return weapons;
    }

    // Getter for retrieving the single user
    public User getUser() {
        return user;
    }

    // Method to add a new weapon to the mock database
    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
}
