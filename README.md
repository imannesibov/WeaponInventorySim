# WeaponInventorySim

**WeaponInventorySim** is a Java console application designed to simulate a weapon inventory system. This educational project demonstrates various design patterns and software engineering principles. The application allows users to manage a collection of fictional weapons, each with unique properties, and interact with a simulated inventory system.

## Features

- **Fictional Weapons Inventory**: Includes a diverse range of fictional weapon categories and items.
- **User Simulation**: Manages a single user's inventory with a starting balance.
- **Data Initialization**: Automatically initializes weapon data with fictional names and prices.

## Design Patterns Used

This project incorporates several design patterns to enhance its structure and functionality:

### Model-View-Controller (MVC) Pattern

- **Model**: `User`, `Weapon`, `MockDatabase`  
  Manages data and business logic. These classes handle the core application data and operations, such as user information and weapon details.

- **View**: `ConsoleView`  
  Handles the presentation of data. This class is responsible for displaying information to the user and capturing user input.

- **Controller**: `InventoryController`  
  Manages the interaction between the Model and View. This class coordinates the actions between the user interface and the data model, facilitating user requests and updating the view accordingly.

### Facade Pattern

- **Class**: `InventoryController`  
  Provides a simplified interface to the underlying `MockDatabase` and `ConsoleView`. The `InventoryController` abstracts the complexities of data access and presentation, offering a streamlined interface for the rest of the application.

### Singleton Pattern

- **Class**: `MockDatabase`  
  Ensures a single instance of `MockDatabase` and provides global access through the `getInstance()` method. This pattern is used to control access to a shared resource, ensuring that only one instance of the `MockDatabase` class exists throughout the application.

### Factory Method Pattern (Partial)

- **Class**: `MockDatabase`  
  Uses the `initializeMockData()` method to centralize and manage the creation of `Weapon` objects. This method acts as a factory, generating and initializing weapon data for the application.

### Data Access Object (DAO) Pattern (Partial)

- **Class**: `MockDatabase`  
  Provides methods to access and manipulate `Weapon` and `User` data, simulating data access operations. This pattern is used to abstract and encapsulate the data access logic.

### Dependency Injection

- **Class**: `WeaponInventorySim`  
  Injects dependencies (`MockDatabase` and `ConsoleView`) into the `InventoryController` to enhance flexibility and testability. This approach promotes loose coupling and makes it easier to manage and test different components.

### Command Pattern (Potential)

- **Class**: `ConsoleView`  
  Could potentially be part of a Command Pattern to encapsulate user actions as commands if extended in future designs. This pattern would allow for more flexible command execution and handling.

## Installation

To get started with **WeaponInventorySim**, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/imannesibov/WeaponInventorySim.git