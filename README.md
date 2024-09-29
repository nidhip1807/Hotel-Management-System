Hotel Management System

Overview:-
The Hotel Management System is a Java-based desktop application designed to streamline hotel operations. Its primary goal is to enhance the efficiency of hotel staff by providing an intuitive interface for managing room bookings, guest information, and room status updates. The application utilizes a MySQL database to securely store and retrieve essential information, ensuring smooth operation.

Features:-
The system offers various functionalities. Users can view details of available rooms, including room numbers, bed types, prices, and cleaning statuses. It features a search functionality that allows users to filter rooms based on bed type (such as single or double beds) and availability. Additionally, staff can update the cleaning status of rooms, indicating whether they are clean or dirty.

In terms of guest management, the system allows users to manage guest information, including IDs and room assignments. Staff can easily check in guests to their assigned rooms and update records upon check-out.

The application features an intuitive graphical user interface (GUI) built using Java Swing, making it user-friendly and accessible for hotel staff with varying levels of technical expertise. Clear labels and input fields guide users through the processes of managing rooms and guests.

Data handling is efficiently managed through a connection to a MySQL database, where all room and guest data is stored. The application employs efficient SQL queries to retrieve and update data based on user interactions.

Technical Stack:-
The project is developed using Java as the primary programming language, with the GUI implemented in Java Swing. It relies on MySQL for database management and utilizes DbUtils to convert the ResultSet into a table model for easy display in the GUI.

Code Structure:-
The project consists of several Java classes, each responsible for different functionalities. The main class serves as the entry point of the application and launches the GUI. The SearchRoom class handles the search functionality for available rooms based on bed type and availability, while the UpdateRoom class manages the updating of room statuses, including availability and cleaning status. The Database class establishes a connection to the MySQL database and executes SQL queries.

Use Cases:-
The primary users of the system are hotel staff, who interact with the application to manage room bookings and guest information. Administrators can oversee the entire system, generate reports, and ensure all operations run smoothly.

Conclusion:-
The Hotel Management System serves as an effective tool for hotel management, providing essential functionalities to improve operational efficiency. Its user-friendly interface, combined with robust data handling capabilities, makes it a valuable asset for hotel staff.
