# UI Automation Project

## Overview
Welcome to the UI Automation Framework, a comprehensive solution for automating the testing of web applications. This framework is designed to simplify the process of creating, organizing, and executing UI tests, allowing you to focus on testing your application's functionality with ease and efficiency.


## Automation Architecture Diagram


<kbd>

<img src="https://github.com/binita537/UI-AUTOMATION-PROJECT/assets/75611677/5bff01cd-eb84-4819-ad01-4b9a5cebae1a" alt="your-image-description" style="border: 1px solid black;">
</kbd>



## Spring Boost Architecture Diagram



<kbd>

<img src="https://github.com/binita537/UI-AUTOMATION-PROJECT/assets/75611677/413119a1-9009-4e2c-afa7-6b6c6ea2f707" alt="your-image-description" style="border: 1px solid black;">
</kbd>


## Key Features
* **Structured Configuration:**
Uses pom.xml, application.properties, and config.properties for centralized management of dependencies, application settings, and framework configurations.
* **Dynamic Driver Initialization:**
Utilizes the Factory Design Pattern to instantiate browser drivers dynamically.
*** Maintainable Test Structure:** Implements the Page Object Model (POM) design pattern, ensuring that UI changes only necessitate changes in one place.
* **Reusable Utilities:** Offers utility classes such as CommonActions and CommonUtilities for widely used functions, ensuring DRY (Don't Repeat Yourself) code.
* **Behavior-Driven Development (BDD):** Integrates Cucumber for writing tests in natural language, fostering collaboration between developers, QA, and non-technical stakeholders.
* **Integrated Logging and Reporting:** Captures logs for debugging and creates comprehensive test execution reports.
*  **Spring core:** Used spring boot concept to avoid Boilerplate code

## Technologies Used
* **Build Tool:** Maven (configuration in pom.xml)
* **WebDriver Management:** Factory design pattern for dynamic driver instantiation based on browser preference.
* **Test Structure:** Page Object Model (POM) for organizing test components and improving maintainability.
* **Test Framework:** TestNG or JUnit
* **BDD Integration:** Cucumber
* **Configuration Management:** Custom ConfigUtility class to handle configurations from application.properties and config.properties.
* **Logging:** (Specify your logging library, e.g., Log4j)
* **Reporting:** (Specify your reporting tool, e.g., ExtentReports)

## Prerequisites
* Java JDK installed (Specify the version, e.g., JDK 8 or higher).
* Maven installed for dependency management.
* A suitable IDE (like IntelliJ IDEA or Eclipse) with Cucumber plugins installed for BDD feature file execution.
* Browser driver executables (e.g., ChromeDriver for Chrome) set up and available in the system PATH.


## Installation
1. Clone the Repository:
`git clone https://github.com/your-repo-link/UI-AUTOMATION-FRAMEWORK.git`
3. Navigate to the Project Directory:
 `cd UI-AUTOMATION-FRAMEWORK`
4. Install Dependencies:
  All the project dependencies are listed in the pom.xml file. Maven will automatically handle them.
   `mvn clean install`
5. Configure Framework:
    Update application.properties and config.properties with appropriate configurations like base URL, browser choice, etc.
    Execute Tests:
    `mvn test`
6. View Reports:
   After test execution, access the generated reports from the target directory or any specified report directory.

## Folder Structure
[Project structure create by using this link https://start.spring.io/ ]
* **src/main/java:** Contains Java source code, including page objects and utilities.
* **src/main/resources:** Contains the feature files and application.properties
* **src/test/java:** Contains Test Runner.
* **test-output:** Contains generated reports and Logs.


## Key Components

### 1. `pom.xml`, `application.properties`, and `config.properties`
- Configuration settings are managed through these files.
- The `config.properties` file contains the application-specific configuration.
- The `application.properties` file holds general application settings.
- The `pom.xml` file manages dependencies and build configurations.

### 2. Config Utility Class
- The `ConfigUtility` class is used to read and manage configuration settings from the properties files.

### 3. Factory Design Pattern for Driver Initialization
- The factory design pattern is employed to create and manage web drivers for different browsers (e.g., Chrome, Firefox).
- This ensures flexibility and scalability in testing across various browser environments.

### 4. Page Object Model (POM)
- The Page Object Model (POM) design pattern is implemented to create page classes that represent web pages.
- Each page class encapsulates the web elements and actions on that page, promoting code maintainability.

### 5. Common Action and Utilities
- The project includes `CommonAction` and `CommonUtilities` classes that provide reusable methods for interacting with web elements and performing common actions.

### 6. Cucumber Feature Files and Step Definitions
- Cucumber feature files are used to define test scenarios using Gherkin syntax, which is human-readable.
- Step definitions map Gherkin's steps to automation code and utilize the Page Object Model (POM) for interaction with web elements.

### 7. Hooks
- Hooks (e.g., `Before` and `After` hooks) handle setup and teardown tasks for test scenarios.
- Setup tasks may include initializing the web driver or navigating to a specific page.
- Teardown tasks may include closing the browser or logging test results.

### 8. Runner (TestNG or JUnit)
- Tests are executed using test runners like TestNG or JUnit, depending on your preference.
- Parallel test execution can be configured for faster test execution.

### 9. Logging
- Logging is implemented to capture important events, actions, and errors during test execution.
- Logs are essential for debugging and troubleshooting.

### 10. Report
- The project includes reporting mechanisms to generate detailed test reports.
- Tools like ExtentReports or Allure can be used to create comprehensive test reports.

## Usage

## Contribution

## License

## Contact Information
If you have any questions, or suggestions, or need assistance with this project, feel free to reach out:

- **Your Name**
  - Email: binitaoffical02@gmail.com 
  - GitHub: https://github.com/binita537/
  - LinkedIn: https://www.linkedin.com/in/binita-rathour-683ba0200/

## Authors
- **Binita Rathour Jagram**

