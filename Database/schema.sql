CREATE DATABASE CarpetCleaningDB;
USE CarpetCleaningDB;

CREATE TABLE Customers (
    CustomerId INT AUTO_INCREMENT PRIMARY KEY,
    FullName VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(15) NOT NULL,
    Address TEXT NOT NULL
);

CREATE TABLE Orders (
    OrderId INT AUTO_INCREMENT PRIMARY KEY,
    CustomerId INT,
    CarpetType VARCHAR(50) NOT NULL,
    SquareMeters DECIMAL(5,2) NOT NULL,
    TotalPrice DECIMAL(10,2) NOT NULL,
    OrderStatus VARCHAR(20) DEFAULT 'Alındı',
    FOREIGN KEY (CustomerId) REFERENCES Customers(CustomerId)
);
