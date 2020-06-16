# Spring Boot + Spring Security + JWT
This is a vanilla Spring Boot and Spring Security project that implements JWT based authentication and authorization.

* An endpoint that can authenticate and return a JWT has been implemented. 
* A SecurityConfigurer is defining resources that need to be authenticated or not.
* A Security Filter intercept all coming requests, extract JWT from the header and validate and set it in the execution context.

# How to test
There is a Postman Collection in "postman" folder. 

Endpoints: 
* /authenticate
* /hello

### Additional Links
These additional references should also help you:

* https://spring.io/projects/spring-security
* https://jwt.io/
* https://www.youtube.com/watch?v=X80nJ5T7YpE
* http://www.pantasoft.co.uk

