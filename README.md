# ATM Simulator Project (Java + MySQL)

## Project Description
This is a desktop-based ATM Simulator application developed using Java Swing and MySQL.
The project simulates basic ATM functionalities such as user login, signup, deposit, withdrawal,
balance enquiry, mini statement, and PIN change.

## Features
- User Login with Card Number and PIN
- New User Signup (Multi-step form)
- Deposit and Withdrawal operations
- Balance Enquiry
- Mini Statement
- PIN Change
- Secure database connectivity using JDBC

## Technologies Used
- Java (Core Java, Swing)
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse / NetBeans IDE

## Database Design
The database is designed using multiple tables:
- login
- signup
- signuptwo
- signupThree
- bank

The database schema is provided in a separate file named `database.sql`.

## Database Setup
1. Install MySQL on your system.
2. Open MySQL Workbench or Command Line.
3. Run the `database.sql` file to create the database and required tables.
4. Update database credentials locally in `Conn.java` before running the project.

> Note: Database credentials are not included in this repository for security reasons.

## Project Structure
ATM-Simulator
│
├── src/
│ ├── bankmanagementsystem/
│ │ ├── Login.java
│ │ ├── Conn.java
│ │ ├── Deposit.java
│ │ ├── Withdrawl.java
│ │ ├── MiniStatement.java
│ │ ├── PinChange.java
│ │ ├── SignupOne.java
│ │ ├── SignupTwo.java
│ │ └── SignupThree.java
│
├── icons/
│ ├── atm.jpg
│ └── logo.jpg
│
├── database.sql
└── README.md

## How to Run the Project
1. Clone or download the repository.
2. Open the project in Eclipse or NetBeans.
3. Add MySQL JDBC Driver to the project.
4. Configure database credentials in `Conn.java`.
5. Run `Login.java` to start the application.

## Learning Outcome
- Hands-on experience with Java Swing
- Understanding of JDBC and SQL integration
- Database design and table relationships
- Real-time application flow handling

## Author
Survepalli Karthik  
(B.Tech Student | Java Developer Aspirant)
