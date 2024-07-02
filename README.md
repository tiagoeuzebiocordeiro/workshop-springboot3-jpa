# Web Service Project

## Description

This project is a web service that simulates Orders, Order Items, and Products. The service provides endpoints to manage Users with full CRUD operations and limited operations for Orders, Order Items, and Products.

## Endpoints

### User

- **GET /users**: Retrieve a list of all users.
- **GET /users/{id}**: Retrieve details of a specific user by ID.
- **POST /users**: Create a new user.
- **PUT /users/{id}**: Update an existing user by ID.
- **DELETE /users/{id}**: Delete a user by ID.

### Order

- **GET /orders**: Retrieve a list of all orders.
- **GET /orders/{id}**: Retrieve details of a specific order by ID.

### Product

- **GET /products**: Retrieve a list of all products.
- **GET /products/{id}**: Retrieve details of a specific product by ID.

### Requirements and Project Technologies
- Made with Java 17, need it.
- Made with Spring Boot 3 with H2 local database, just clone and you'll get it.
- Tested with Postman, but you can test it with any request tool of your preference.

Just do a git clone and start you application. :)
