# Query Hints in Spring Data JPA

In this repository you can check the usage of Query Hints in Spring Data JPA, a feature that allows developers to fine-tune their database queries by providing additional information to the underlying JPA provider (such as Hibernate) on how to execute the queries more efficiently

# Overview
In Spring Data JPA, you can use query hints to control the execution behavior of queries, especially in terms of optimizing performance. Query hints can be applied in both JPQL and native SQL queries.

# Key Features:
- Optimize database query performance.
- Control fetching behavior.
- Influence query caching and transaction management.
- Custom hints for JPA providers like Hibernate.

# Prerequisites
Before using this repository, ensure you have the following installed:

- Java 8 or later
- Maven or Gradle (for dependency management)
- Spring Boot 2.x or later
- Spring Data JPA and Hibernate (for ORM)

# Getting Started
Download or clone the reposotory

- Run Docker compose yaml to create Database
- Insert more than 300 thousands records in table
- In CustomerRepository try to remove the Query Hints and try to call the Rest API and note down the the time
- Put the Query Hints and again try to call the REST API again and note down the time

