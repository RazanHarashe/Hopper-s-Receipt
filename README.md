# Market - Hopper's Receipt Application

This project is a simple Spring Boot application that renders a receipt for a single item purchase. It demonstrates the use of JSP and JSTL for rendering views in a Spring Boot application.

## Introduction

Grace Hopper is giving a talk at MIT and needs to order some thin metal wires to represent nanoseconds. This application renders a receipt for her purchase from a small local business using a new third-party purchasing app, Market2.

## Explanation of Files

- **HomeController.java:** The controller that handles requests to the root URL and passes model attributes to the JSP view.
- **index.jsp:** The JSP file located in `src/main/resources/templates` that renders the purchase receipt.
- **application.properties:** Configuration file for the Spring Boot application.
- **pom.xml:** Maven configuration file that includes dependencies for Spring Boot, JSP, and JSTL.
