# Fi-Do Expense Tracker

![Splash page](./src/main/resources/static/img/index.png)


## Author
* Liz Mahoney [Github profile emd5](https://github.com/emd5)
* Levi Porter [Github profile levibrooke](https://github.com/levibrooke)
* Sudip Adhikari [Github profile sadhikari07]https://github.com/sadhikari07)
* Kishor Pandey [Github profile kishorpan2](https://github.com/kishorpan2)

## Version 
1.0.0

## Overview
A pet expense tracker app that keeps track of month-to-month expenses. Features include:
* Ability to sign-up
* Ability to Login using username and password
* Consists of category expense breakdown
* Ability to create expense and see all expenses in the dashboard
* The dashboard page will also show monthly expenses by category, total amount by category and the total expenses.



## Links 
Deployed Link - <http://fido-expenses-tracker.us-west-2.elasticbeanstalk.com/>

## Getting Started

    - On your local, create a folder named `fido`.
    - Then `git init`.
    - On github, copy the link and clone repo inside of the folder that you created
    `git clone https://github.com/team-char/pet-expenses-tracker.git`.
    - Go inside the directory `pet-expenses-tracker` Then open intelliJ `idea .`
    - In the import project popup screen, select `used import`, and select appropriate `JDK` (can be 8 or above)
    cd.
    - Go to `src` > `main` > `resource` > `application.properties`
    - Change `spring.jpa.hibernate.ddl-auto=create` to `spring.jpa.hibernate.ddl-auto=update`
    - Then Run application to build the database for `/sign-up` and `/login`

***To Run Application***

In terminal run: `./gradlew bootrun`

***To view gradle commands***

In terminal run: `./gradlew tasks`

***To Run Test***

In terminal run: `./gradlew test`

## Setup

Use the Spring `Initializr` to set 
    up an app with dependencies on Web, Thymeleaf, JPA, Postgres, and Security (and optionally DevTools for auto refresh
    of app on building). Remember to do your initial commit on the master branch before creating your feature branch.
    Also, see the below note about configuring Spring Security.

## Routes

* This route will take user to the sign-up page
`/sign-up`
![Sign up](./src/main/resources/static/img/signUp.png)
* This route will take user to the login page
    `/login`
    ![Login](./src/main/resources/static/img/logIn.png)
* This route will take user to the sign-out page
    `sign-out`
* This route will take user to create expense
    `/add-expense`
    ![Add-expense](./src/main/resources/static/img/addExpense.png)
* This route will take user to the dashboard
    `/dashboard`
    ![Dashboard](./src/main/resources/static/img/dashboard.png)
* This route will take user where all the expenses are listed.
    `/all-expenses`
    ![All-expenses](./src/main/resources/static/img/allExpense.png)
* This route will take user to the authors.
    `/about-us`
    ![About us](./src/main/resources/static/img/aboutUs.png)
* This route will take user to the splash page
    `/`
    ![Splash page](./src/main/resources/static/img/index.png)

## Technologies used in this application:
* Intellij
* gradle
* spring boot
* github
* chart js
* AWS (RDS and EC2)


## Resources 
    - Sprint Auth Cheat Sheet -> https://github.com/codefellows/seattle-java-401d4/blob/master/SpringAuthCheatSheet.md 
    - Hiberate Many-to-Many -> https://www.baeldung.com/hibernate-many-to-many
    - RDS Cheat Sheet - https://github.com/codefellows/seattle-java-401d4/blob/master/RDSCheatSheet.md
    - Currency format -> http://www.captaindebug.com/2011/08/using-spring-3-numberformat-annotation.html#.XRF7upNKgsk
    - Generate an empty table the populate DB -> https://www.baeldung.com/spring-boot-data-sql-and-schema-sql
    - Css -> https://purecss.io/
    - Charts -> https://canvasjs.com/docs/charts/basics-of-creating-html5-chart/
    - Integration tests for our Spring Boot Rest APIs -> https://www.javaguides.net/2018/09/spring-boot-2-rest-apis-integration-testing.html
    - How to register your event listener and create a database seeder in Spring Boot-> https://dzone.com/articles/how-to-create-a-database-seeder-in-spring-boot
    - Logo -> https://www.freelogodesign.org/?v=direct&sv=ni&utm_expid=.zKm1QJTySpqlGxV9Kiu8cQ.2&utm_referrer=https%3A%2F%2Fwww.freelogodesign.org%2F%3Fv%3Ddirect%26sv%3Dni
     