![Java](https://img.shields.io/badge/Java-17-orange)
![RestAssured](https://img.shields.io/badge/RestAssured-API-green)
![JUnit](https://img.shields.io/badge/JUnit-5-red)

# Pokemons API Automation Tests

API automation framework for testing Pokemons service.

## Tech Stack

- Java 17
- RestAssured
- JUnit 5
- Maven
- Lombok
- Allure Reports

## Project Structure
```
src
├── client — API clients
├── config — configuration management
├── model — request/response DTO
├── service — business operations
├── specification — request/response specs
├── utils — helpers
└── tests — test cases
```
## Configuration

The project uses environment variables for secrets.

Example:

TRAINER_TOKEN=your_token_here

## Running tests

Run tests via Maven:

mvn clean test

Or run tests directly from IntelliJ.

## Reports

Allure reports are supported.

Generate report:

mvn allure:serve


## Example Test Scenario

1. Create Pokemon
2. Extract Pokemon ID
3. Get Pokemon by ID
4. Validate response

