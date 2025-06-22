# Contact Management System (Java)

This is a simple console-based Contact Management System written in Java. It allows users to store, search, and delete contacts using a basic list-based approach.

## Features

* Add new contacts
* Remove existing contacts
* Search contacts by name and number
* Console-based user interaction with a simple menu

### How It Works

1. The user is prompted to enter a phone number.
2. The program loops through the list of contacts (`GlobalData.kontakty`).
3. If a contact matches the full string: `firstName + lastName + number`, it is removed.
4. A confirmation message is displayed. If no match is found, an appropriate message is shown.
5. The main menu is displayed again.

##  Technologies Used

* Java (Standard Edition)
* Java Collections API (`ArrayList`)
* Console I/O (`Scanner`)

## Structure

* `Kontakt` – a class representing a contact (name, surname, number).
* `GlobalData.kontakty` – a global list storing all contacts.
* `menu()` – the main menu method for user interaction.

## Requirements

* Java 8 or higher
* Any Java-compatible IDE (e.g., IntelliJ, Eclipse) or command line
