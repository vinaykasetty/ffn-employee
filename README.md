# ffn-employee

### Employee project package structure

- api : list the domain objects exposed to the outside world
- config: all the configuration classes for the project
- controller: defines the rest endpoint of the service
- dao: data access layer, it has an interface and an implementation of the interface. this protects the service implementation from the underlying database implementation
- db: defines the db domain objects, jpa repository and db implementation
- exception: all the exceptions of the service
- service: the service implementation, it has an inteface and an implemenation of the interface. this protects the contoller from directly talking to the underlying db layer
- service.mapper: mapping data between the api and db domain objects


### Todo

- Validation in service layer and throw exception
- Exception handling and logging
- Swagger implementation
- Security
- unit test coverage

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
 
