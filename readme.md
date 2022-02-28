# Modular Monolith Java example

## What is this

The Software Design guild have been discussing the benefits of using a "package by feature" approach to creating monoliths.
This is a demo/example of a Java Spring application which has been split up into internal modules.

The software is being run through the application folder.  This is the container for all our modules.
This example comes with 2 features packages which are completely independent, "Library" and "New Feature".

The application calls the public entry points for each package to load a simple string in the browser.

You will notice that only the main entry point class in each package is being made public. All other files are left as default, meaning access is only available within the package.

## What are the benefits

One of the benefits of a modular monolith, over a layered one for example, is the ability to much more easily break into a distributed architecture at a later date.  
The application has already been broken apart by context boundaries into independent modules.

Other benefits include
- Easier to refactor.
- Multiple teams able to work in parallel.  

## What is being used

- Java 17
- Spring Boot 2.6.4
- Maven 3.8.4

## Build

Download and install the dependencies

```
./mvnw install
```

Run the application

```
./mvnw spring-boot:run -pl application
```

## Preview your changes locally

Head to localhost to see the 2 different packages being loaded through the main application

- [Home](http://localhost:8080/)

- [New Feature](http://localhost:8080/newfeature/)

## Licence

Unless stated otherwise, the codebase is released under the MIT License. This covers both the codebase and any sample code in the documentation.

The documentation is © Crown copyright and available under the terms of the Open Government 3.0 licence.