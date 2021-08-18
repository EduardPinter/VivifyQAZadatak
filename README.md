## Description

Using Java Selenium with Maven in Intellij enviroment

## Installation

Use the Maven to install all the neccessary dependencies from pom.xml file

## Pre-test data changing

Before running the test change the email variable in src/main/java/dataInput/DataStrings to another valid email adress in order for the registration to be successful

## Usage

Run tests in particular order in terminal using these commands

```bash
mvn clean test -Dtest=Test_1Register
mvn clean test -Dtest=Test_2Login
mvn clean test -Dtest=Test_3CreateGalleryNoDesc
mvn clean test -Dtest=Test_4CreateGalleryOnePic
mvn clean test -Dtest=Test_5CreateGalleryThreePic
mvn clean test -Dtest=Test_6CreateGalleryThreePicNoDesc
mvn clean test -Dtest=Test_7MyGalleryCreatedGallery
mvn clean test -Dtest=Test_8Logout
```

For running tests in Firefox on the end of the lines add the following code

```bash
-Dbrowser=firefox
```

## Allure report

For full allure report run this command in terminal after running all the tests

```bash
allure serve allure-results
```

## Postman collections

Import the collection and enviroment file into Postman and run the tests in order


