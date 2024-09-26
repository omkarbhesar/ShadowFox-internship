# ShadowFox-internship
Welcome to Shadow Fox, a repository showcasing my internship tasks in Java. This repository highlights my progress and experience gained during the internship, focusing on practical Java applications.
# Multi-Utility Java Application

This repository contains two Java applications:

1. **Calculator** - A command-line calculator that performs arithmetic, scientific, and unit conversion operations.
2. **Contact Management System** - A contact management system that allows users to add, view, update, and delete contacts with basic input validation.

## Project Overview

### 1. Calculator Application

This calculator supports three major functionalities:
- **Arithmetic Operations**: Addition, Subtraction, Multiplication, and Division.
- **Scientific Calculations**: Includes operations like square root, exponentials, trigonometric functions (sin, cos, tan), and logarithms.
- **Unit Conversions**: Convert between common units such as meters to kilometers, Celsius to Fahrenheit, inches to centimeters, and more.

#### Features:
- **Arithmetic Operations**:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- **Scientific Operations**:
  - Square root
  - Square
  - Exponential
  - Cube root
  - Cube
  - Trigonometric Functions (sin, cos, tan)
  - Logarithm
- **Unit Conversion**:
  - Meter ↔ Kilometer
  - Celsius ↔ Fahrenheit
  - Centimeter ↔ Inches
  
#### How to Use:

1. **Run the Application**:
   Compile and run the `Calculator` class.
   
   ```bash
   javac Calculator.java
   java shadow.fox.Calculator
   ```

2. **Choose Operation**:
   - Select whether to perform arithmetic, scientific calculations, or unit conversions from the main menu.
   - Follow the prompts to input numbers and see the results.

### 2. Contact Management System

This system allows users to manage contacts, including adding, viewing, updating, and deleting contacts. Each contact includes a name, phone number, and email. The system performs validation to ensure that phone numbers are exactly 10 digits.

#### Features:
- **Add Contact**: Add a contact with name, phone number, and email. The phone number must be 10 digits.
- **View Contacts**: Displays all contacts in a formatted list.
- **Update Contact**: Modify an existing contact by searching for it via phone number.
- **Delete Contact**: Remove a contact by phone number.
- **Exit**: Quit the system.

#### How to Use:

1. **Run the Application**:
   Compile and run the `ContactManagementSystem` class.
   
   ```bash
   javac ContactManagementSystem.java
   java ContactManagementSystem
   ```

2. **Main Menu**:
   - Use the numeric options to add, view, update, or delete contacts.
   - Enter the corresponding phone number to update or delete a contact.

---

## How to Run

### Prerequisites:
- **Java 8 or higher**
- A Java IDE (like IntelliJ, Eclipse) or the command line setup for Java.

### Steps to Run Both Applications:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-username/java-utilities.git
   cd java-utilities
   ```

2. **For the Calculator**:
   - Compile the `Calculator.java` file:
     ```bash
     javac Calculator.java
     ```
   - Run the application:
     ```bash
     java shadow.fox.Calculator
     ```

3. **For the Contact Management System**:
   - Compile the `ContactManagementSystem.java` file:
     ```bash
     javac ContactManagementSystem.java
     ```
   - Run the application:
     ```bash
     java ContactManagementSystem
     ```

---

## Code Overview

### Calculator

- **`arithmetic_operations`**: Handles basic arithmetic (add, subtract, multiply, divide).
- **`scientific_calculations`**: Performs square root, exponentiation, trigonometric, and logarithmic functions.
- **`unit_conversion`**: Converts between different units (length, temperature).

### Contact Management System

- **`Contact` Class**: Represents a contact with name, phone number, and email. Includes validation for phone numbers.
- **`ContactManagementSystem` Class**: Handles the main logic for managing contacts. Supports operations to add, view, update, and delete contacts using a simple menu-driven interface.

---

## Future Enhancements

1. **Calculator**:
   - Add support for more advanced scientific functions.
   - Improve error handling for invalid inputs (e.g., division by zero).
   - Support for storing and recalling previous results.

2. **Contact Management System**:
   - Implement persistent storage (save contacts to a file or database).
   - Add search functionality to find contacts by name or email.
   - Add GUI for a more user-friendly experience.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

Feel free to contribute to both projects by submitting pull requests or reporting issues!
