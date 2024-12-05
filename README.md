# Student_Management_System
This Java program provides a console-based Student Management System that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

Here's a detailed breakdown of the code:

1. Package and Imports:
package com.prathmesh.Student_management_system;: Defines the package where this class resides.
import java.util.List;: Imports the List interface for handling collections of student objects.
import java.util.Scanner;: Imports the Scanner class to accept user input.

2. Main Class and Method:
Class Main_app: The entry point of the application.
main() Method: Contains the logic to interact with the user and manage student data.

3. Program Flow and Features:
a. Welcome Message and Menu Display:
Displays a welcome message.
Provides a menu with six options:
Add New Student
View All Students
Update Student
Delete Student
Search Student
Exit
b. Menu Options and Functionalities:
Infinite Loop (while(true)): Keeps displaying the menu until the user chooses to exit.

User Input Handling:
int userInput = sc.nextInt(); captures the user's choice.

4. Case-Wise Breakdown:
Case 1: Add New Student

Prompts the user to enter student details: Roll Number, First Name, Last Name, Department, and Gender.
Calls the insertRecord() method from the Student_Info class to save the data.
Displays success or failure messages based on the result.
Case 2: View All Students

Calls the readRecord() method to fetch a list of all students.
Iterates through the list and prints each student's details.
Case 3: Update Student

Prompts for the Roll Number of the student to update.
Displays the student’s current details.
Provides options to update specific fields: First Name, Last Name, Department, or Gender.
Updates the selected field using setter methods.
Calls updateRecords() to save changes.
Case 4: Delete Student

Prompts for the Roll Number of the student to delete.
Calls the deleteRecord() method and displays success/failure messages.
Case 5: Search Student

Prompts for the Roll Number.
Calls searchRecords() and displays the student’s details if found.
Case 6: Exit

Exits the loop and displays a goodbye message.

5. Additional Details:
Exception Handling: The program assumes valid input and does not include exception handling for invalid inputs.
Use of Student_Info Class: The program interacts with Student_Info, presumably a class that manages student records using methods like insertRecord(), readRecord(), updateRecords(), deleteRecord(), and searchRecords().

