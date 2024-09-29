Hotel Management System

Overview
The Hotel Management System is a Java-based desktop application designed to facilitate the management of hotel operations. Its primary goal is to enhance the efficiency of hotel staff by providing a streamlined interface for handling room bookings, guest management, and room status updates. The application utilizes a MySQL database to store and retrieve essential information, ensuring that all operations are executed smoothly and securely.

Features
The system offers various functionalities. Users can view the details of all available rooms, including room numbers, bed types, prices, and cleaning status. It includes a search feature that allows users to filter rooms based on bed type (such as single or double beds) and availability. Additionally, staff can update the cleaning status of rooms to reflect their current condition, such as whether they are clean or dirty.

In terms of guest management, the system allows users to manage guest information, including their IDs and room assignments. Staff can easily check in guests to their assigned rooms and update records when they check out.

The application features an intuitive graphical user interface (GUI) built using Java Swing, making it user-friendly and accessible for hotel staff with varying levels of technical expertise. Clear labels and input fields guide users through the process of managing rooms and guests.

Data handling is efficiently managed through a connection to a MySQL database, where all room and guest data is stored. The application employs efficient SQL queries to retrieve and update data based on user interactions.

Technical Stack
The project is developed using Java as the primary programming language, with the GUI implemented using Java Swing. It relies on MySQL for database management. The project utilizes DbUtils to convert the ResultSet into a table model for display in the GUI.

Code Structure
The project consists of several Java classes, each responsible for different functionalities. The main class serves as the entry point of the application and launches the GUI. The SearchRoom class handles the search functionality for available rooms based on bed type and availability, while the UpdateRoom class manages the updating of room status, including availability and cleaning status. The Database class establishes a connection to the MySQL database and executes SQL queries.

Use Cases
The primary users of the system are hotel staff, who interact with the application to manage room bookings and guest information. Administrators can oversee the entire system, generate reports, and ensure all operations run smoothly.

Conclusion
The Hotel Management System serves as an effective tool for hotel management, providing essential functionalities to improve operational efficiency. Its user-friendly interface, combined with robust data handling capabilities, makes it a valuable asset for hotel staff.
