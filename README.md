# User-Defects-Portal
(Spring Boot Project)

```bash 
Microservice 1 --> User-service 
```

  * id(auto generated)

  * username

  * password

  * email

  * phone number

  * address
  
```bash
 Microservice 2 --> Defects-service 
```

  * defect-id(auto generated)

  * product name 

  * defect details

  * status (open/closed)

  * date 

  * username (user that stated it)
  
```bash 
Microservice 3 --> User-profile-service
```

  * consumes # Microservice 1 @Rest Template

  * consumes # Microservice 2 @Feign Client
  
 ```bash  
Result : User info + Defect details 
```

 > **Microservices interact through Service Discovery Pattern.**
 
 *Requirement Of Service Discovery :-*
  * Dynamic urls in cloud
  * Load Balancing
 ```bash 
 Technology to implement "SERVICE DISCOVERY" : EUREKA 
 ```
