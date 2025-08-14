# MakeMyTrip_Testing
Overview
This project contains the automated testing scripts and test cases for the MakemyTrip application. The purpose of this testing is to ensure the flight booking functionality works correctly, efficiently, and reliably across different scenarios.

What This Testing Does
Verifies the end-to-end flight booking process, including searching flights, selecting options, entering passenger details, and completing payment.

Checks validation of input fields such as dates, passenger information, and payment details.

Validates error handling and messaging for invalid inputs and failed transactions.

Tests UI responsiveness and workflow consistency across various browsers and devices.

Ensures integration and communication with backend services such as flight databases and payment gateways.

Why This Testing Is Needed
To identify bugs and issues early in the flight booking workflow, preventing customer dissatisfaction.

To maintain high quality and reliability of the application with every release or update.

To reduce manual testing effort by automating repetitive test cases.

To validate compliance with business rules and legal requirements related to flight booking.

To improve overall user experience by ensuring smooth transaction flows.

How to Run the Tests
Prerequisites
Git installed on your system

Appropriate testing frameworks/tools installed (e.g., Selenium WebDriver, JUnit, TestNG – specify based on your project)

Required browsers installed for UI testing (Chrome, Firefox, etc.)

Access to the test environment or live URL of the BookFlightTicket application

Running Tests
Clone this repository:

bash
git clone https://github.com/ChitrAansha369/MakeMyTrip_Testing.git
cd MakeMyTrip_Testing
Install dependencies (example for Java Maven):

bash
mvn clean install
Configure test settings if needed (e.g., update config files with environment URLs, credentials).

Run the tests:

For Maven:

bash
mvn test
For other frameworks, follow respective CLI commands or IDE run configurations.

View test reports generated in the /target/surefire-reports/ or specified output directory.
