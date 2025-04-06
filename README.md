# SeleniumCucumber Automation Framework 🚀

This is a robust automation testing framework built using **Selenium WebDriver**, **Cucumber (BDD)**, and **Java**. The project is designed with best practices, including:
- Cucumber Hooks
- Logback logging mechanism
- Parallel execution support via TestNG
- Page Object Model (POM) structure

## 📁 Project Structure

```
SeleniumCucumber/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/             # Page Object classes
│   │       ├── utility/           # DriverFactory, Logger config, etc.
│   ├── test/
│   │   └── java/
│   │       ├── stepdefinitions/   # Cucumber Step Definitions
│   │       ├── runners/           # TestNG Runner classes
│   │       └── features/          # Cucumber feature files
├── pom.xml
└── testng.xml
```

## 🧰 Tech Stack

- **Java 11+**
- **Maven**
- **Selenium WebDriver**
- **Cucumber (Gherkin)**
- **TestNG**
- **Logback for Logging**
- **Extent Reports** *(optional/customizable)*
- **Hooks for pre/post conditions**
- **POM design pattern**

## 🔧 Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Krushabh/SeleniumCucumber.git
   cd SeleniumCucumber
   ```

2. **Import into IDE (IntelliJ / Eclipse)**
   - Choose _Import Project as Maven_
   - Wait for dependencies to resolve

3. **Run Tests**
   - From terminal:
     ```bash
     mvn clean test
     ```
   - Or run via TestNG (`testng.xml`)

## 🎯 Running in Parallel

This framework is TestNG-enabled for parallel execution.

- Update `testng.xml` with the `parallel` and `thread-count` attributes:
  ```xml
  <suite name="ParallelSuite" parallel="tests" thread-count="2">
      <test name="Test1">...</test>
      <test name="Test2">...</test>
  </suite>
  ```

## 🔍 Logging & Reports

- Logging is managed using **SLF4J + Logback**.
- Logs are printed on the console and can be extended to log files.
- Reporting (Extent Reports, Allure, etc.) can be easily integrated.

## 📊 Sample Feature

```gherkin
Feature: Validate Online Products

  Scenario: Open formal shoes and verify details
    Given User launches the browser and opens Online Products page
    When User clicks on the Formal Shoes dropdown
    Then User should see a list of formal shoes
```

## 🤝 Contribution

Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.

---

**Author:** Krushabh  
**GitHub:** [github.com/Krushabh](https://github.com/Krushabh)

