# databaseas2
Java Console Application for Bookstore Management

Description: This Java-based console application functions as an intricate system for managing a bookstore. It empowers users to execute a variety of tasks related to books, authors, customers, orders, and transactions. The application seamlessly interfaces with a PostgreSQL database, facilitating the storage and retrieval of information.


Features:

Book Management: Create a new book, providing details such as title, genre, price, stock quantity, and author ID. View a list of all books. Display detailed information about a specific book, including associated orders.
Author Management: Create a new author, specifying details like name, birth date, and country. View a list of all authors. Update author information. Delete an author.
Customer Management: Create a new customer with first name, last name, email, and phone details. View a list of all customers. Update customer information. Delete a customer.
Order Management: Delete an order, including associated order details. Update order details for a specific order.
Metadata Information: Display information about tables in the database, including primary and foreign keys. Display detailed column information for a specific table.

Installation Instructions:

Clone the repository to your local machine:
git clone https://github.com/rufaglva/databaseas2.git
cd yourproject
Set up the PostgreSQL database and configure the connection details in the DbFunctions class.
Run the application using the following command:
java -jar yourproject.jar	

Usage:
Utilize the application to perform actions such as creating, viewing, updating, and deleting records for books, authors, customers, and orders. Place new orders, manage order details, and retrieve metadata information about tables and columns within the database.
