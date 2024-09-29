Hotel Management System

Overview
The Hotel Management System is a Java-based desktop application designed to facilitate the management of hotel operations. It aims to enhance the efficiency of hotel staff by providing a streamlined interface for handling room bookings, guest management, and room status updates. The application leverages a MySQL database to store and retrieve essential information, ensuring that all operations are executed smoothly and securely.

Features
Room Management:

View Rooms: Users can view the details of all available rooms, including room numbers, bed types, prices, and cleaning status.
Search Rooms: The application provides a search feature that allows users to filter rooms based on bed type (e.g., single or double beds) and availability.
Update Room Status: Staff can update the cleaning status of rooms to reflect their current condition (e.g., clean, dirty).
Guest Management:

Manage Guests: The system allows users to manage guest information, including their IDs and room assignments.
Check-in and Check-out: Staff can easily check in guests to their assigned rooms and update records when they check out.
User Interface:

The application features an intuitive GUI built using Java Swing, making it user-friendly and accessible for hotel staff with varying levels of technical expertise.
Clear labels and input fields guide users through the process of managing rooms and guests.
Data Handling:

The application connects to a MySQL database, where all room and guest data is stored.
Efficient SQL queries are utilized to retrieve and update data based on user interactions.
Technical Stack
Programming Language: Java
GUI Framework: Java Swing
Database: MySQL
Libraries:
DbUtils for converting ResultSet into a table model for display in the GUI.
Code Structure
The project consists of several Java classes, each responsible for different functionalities:

Main Class: The entry point of the application that launches the GUI.
SearchRoom Class: Handles the search functionality for available rooms based on bed type and availability.
UpdateRoom Class: Manages the updating of room status, including availability and cleaning status.
Database Class: Establishes a connection to the MySQL database and executes SQL queries.
Use Cases
Hotel Staff: The primary users of the system, who will interact with the application to manage room bookings and guest information.
Administration: Administrators can oversee the entire system, generate reports, and ensure all operations run smoothly.
Conclusion
The Hotel Management System serves as an effective tool for hotel management, providing essential functionalities to improve operational efficiency. Its user-friendly interface, combined with robust data handling capabilities, makes it a valuable asset for hotel staff.

