# FlixHub - Movie Platform

FlixHub is a film platform that allows the registration and listing of films. It was developed using Spring Boot with Java and includes a form that collects information about the film's name, year of release, duration and genre. Movie data is stored in a database that can be easily manipulated through CRUD (Create, Read, Update, Delete) operations.

## How to use

### Prerequisites
- Java Development Kit (JDK) 11 or higher installed.
- Maven installed for compilation and dependency management.
- A configured database (by default we use H2 Database to simplify configuration).

### Settings
Clone this repository to your machine:

    ```bash
     https://github.com/segundoantonio/flixhub.git

### Accessing the Application
After starting the project, you can access the film platform in your browser:
    http://localhost:8080

### Functionalities
FlixHub offers the following features:

Film Registration: Fill out the form with information about the name of the film, year of release, duration and genre, and click on the button.

Film Listing: All registered films are displayed on the home page.

Movie Update: You can edit the details of an existing movie.

Deleting Movies: You can delete movies from the platform.

### Technologies Used
- Java
- Spring Boot
- Thymeleaf for HTML templates
- MySQL

### Project Structure
src/main/java: Java source code.
src/main/resources: Configuration files, HTML templates and static resources.

### Contribution
If you want to contribute to the project, feel free. Any help is welcome!
