# Restaurant Management System

## Frameworks and Language Used

- Framework: Spring Boot
- Language: Java

## Data Flow

### Controllers

1. `RestaurantController`: Handles HTTP requests related to restaurants.


### Database Design

- The project uses an in-memory list to store restaurant data. There is no database involved in this implementation.

## Data Structure Used in Your Project

- The primary data structure used in the project is a Java class called `Restaurant` to represent restaurant entities.
    - Attributes: id, name, address, phoneNumber, specialty, totalStaff.

## Project Summary

This project is a simple Restaurant Management System implemented using Spring Boot and Java. It allows you to perform basic CRUD operations on restaurants, including adding new restaurants, retrieving restaurant information by ID, updating restaurant specialties, and deleting restaurants.

The project uses an in-memory list to store restaurant data, and there is no database involved. It serves as a basic example for handling RESTful API endpoints in a Spring Boot application.
