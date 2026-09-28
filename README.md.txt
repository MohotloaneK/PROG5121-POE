# PROG5121 Portfolio of Evidence

## Part 1 - Registration and Login

This Java console application implements a user registration and login feature.

### Features

- User registration
- Username validation
- Password complexity validation
- South African cellphone number validation
- User login authentication
- Login status messages
- JUnit unit testing

### Username Requirements

The username must:
- Contain an underscore (_)
- Be no more than five characters long

### Password Requirements

The password must:
- Be at least eight characters long
- Contain a capital letter
- Contain a number
- Contain a special character

### Cellphone Number

The cellphone number is validated using a regular expression and must contain the South African international country code (+27).

### Testing

JUnit tests are included to test:

- Correctly formatted username
- Incorrectly formatted username
- Valid password
- Invalid password
- Valid cellphone number
- Invalid cellphone number
- Successful login
- Failed login
- Expected registration messages
- Expected login messages

All current unit tests pass successfully.

### Technologies

- Java
- Apache NetBeans
- Maven
- JUnit 5
- Git and GitHub