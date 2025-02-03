## Currency Converter API


This is a simple Currency Converter API built using Spring Boot. It provides real-time currency conversion functionality using exchange rates from an external public API.


# Features
- Fetch exchange rates for a specified base currency (e.g., USD).
- Convert amounts between different currencies.
- Handle errors like invalid currency codes or API unavailability.
- Basic unit tests for service layer.


# Technologies Used
- Java (JDK 17+)
- Spring Boot (3.x)
- Maven (Dependency Management)
- JUnit (Unit Testing)
- RestTemplate (API calls)


# Prerequisites
- Java 17+
- Maven
- IDE (IntelliJ IDEA, Eclipse, or VS Code)


# Installation
- Install Maven Dependencies :mvn install
- Run the Application :mvn spring-boot:run
- The application will start at http://localhost:8080.


# API Endpoints

1. GET /api/rates?base=USD
        Fetches the exchange rates for the specified base currency (default: USD).
        Example Request:
        GET http://localhost:8080/api/rates?base=USD
        Example Response:
        {
            "USD": {
                "EUR": 0.94,
                "GBP": 0.75,
                ...
            }
        }

2. POST /api/convert
        Converts a specified amount from one currency to another.
        Request Body:
        {
            "from": "USD",
            "to": "EUR",
            "amount": 100
        }
        Example Request:
        POST http://localhost:8080/api/convert
        Example Response:
        {
            "from": "USD",
            "to": "EUR",
            "amount": 100,
            "convertedAmount": 94.5
        }

# Error Handling

- If an invalid currency code is provided (e.g., ABC), the API will return a 400 error.
If the external API is unavailable, a 500 error will be returned.


# Unit Tests

- The project includes basic unit tests for the service layer. To run the tests, use:
mvn test