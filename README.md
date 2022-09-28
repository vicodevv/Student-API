# Student-API

# Student API with Spring Boot, MongoDB, JPA and Hibernate 

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/vicodevv/Student-API.git
```

**2. Create MongoDB database**

**3. Change MongoDB username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change 

`spring.data.mongodb.authentication-database`
`spring.data.mongodb.username`
`spring.data.mongodb.password`
`spring.data.mongodb.database`
`spring.data.mongodb.port`
`spring.data.mongodb.host`
`spring.data.mongodb.auto-index-creation`

as per your MongoDB installation

**4. Build and run the app using maven**


The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/students
    
    POST /api/v1/students
    
    DELETE /api/v1/students/{id}