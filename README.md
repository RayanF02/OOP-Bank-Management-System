# OOP Bank-Management System

This project is a Java based Bank Management System developed using Object Oriented Programming (OOP) principles. The application simulates how a simple banking system could operate while demonstrating key programming concepts.

## Features

- Create new bank users
- Deposit and withdraw funds
- Store and retrieve user information from files
- Record transaction history in CSV format
- Categorize users into Silver, Gold, and Platinum accounts
- Input validation and exception handling to prevent crashes

## OOP Concepts Used

This project incorporates several core Java and OOP concepts, including:

- Classes and Objects
- Inheritance
- Abstraction
- Interfaces
- Arrays / ArrayLists
- Exception Handling
- File Handling
- Encapsulation
- Method Overriding

## System Overview

The application allows a bank employee or manager to interact with the system through a console based menu. Staff can:

- Create new customer accounts
- Deposit and withdraw money
- Save user data to a text file
- Display saved user information
- Track transaction history through a CSV file

When creating a new account, the initial deposit determines whether the customer is classified as a:

- Silver User
- Gold User
- Platinum User

## File Management

The system stores customer information locally using text files and transaction records using CSV files.

Transaction logs include:

- User ID
- Transaction type
- Transaction amount

## Error Handling

The application uses multiple try-catch blocks and validation checks to reduce crashes caused by invalid user input or incorrect transactions. If an error occurs, the program informs the user and safely returns to the main menu.

## Future Improvements

- Graphical User Interface (GUI)
- Database integration
- Secure authentication system
- Encryption for customer data
- Transaction search and filtering
