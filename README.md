Claro! Aqui está um exemplo de README em inglês para o seu projeto com todas as informações solicitadas:

---

# Selenium Cucumber Java Automation Project

This is an automated test project developed using **Selenium WebDriver**, **Cucumber**, and **Java**, executed within the **IntelliJ IDEA** development environment.

## 📌 Project Overview

The main goal of this project is to automate functional tests for a web application.
Initially, it focuses on two core functionalities:

* Access to the **home page**
* **Account registration** flow

## 📦 Technologies Used

* Java
* Selenium WebDriver
* Cucumber (Gherkin syntax)
* IntelliJ IDEA
* JUnit 4
* Maven

## 📐 Design Pattern: Page Object Model (POM)

This project uses the **Page Object Model (POM)** design pattern to:

* Improve maintainability by separating the logic of interactions from the test steps.
* Reuse components across different tests.
* Make test cases more readable and scalable.

Each page has its own class containing locators and interaction methods.

### Example Structure:

```
src
└── test
    └── java
        ├── pages
        │   ├── HomePage.java
        │   └── RegisterPage.java
        ├── runner
        │   └── RunCucumberTest.java
        └── steps
            ├── HomeStep.java
            └── RegisterStep.java
    └── resources
        └── features
            ├── Home.feature
            └── Register.feature
chromedriver.exe
pom.xml
README.md
```

## ✅ Getting Started

To run this project:

1. Clone the repository.
2. Make sure `chromedriver.exe` matches your Chrome version.
3. Run the tests using your preferred Cucumber runner.

