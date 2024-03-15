Microservice Focused – Sign Up and Sign In Functionality on Spring Boot
(Run the Signup and sign in application file both are on different port )
Overview:
This project focuses on implementing a microservices-based architecture to provide sign-up and sign-in functionality using Spring Boot. The system is divided into two services, namely the sign-up and sign-in services, each deployed on different ports to facilitate separation of concerns and scalability.

Dependencies Used:
•	Spring Boot 3.2.3
•	Java 17
•	Maven Build
•	Spring Dev Tools
•	Spring Data JPA
•	Spring Web
•	MySQL Driver
•	Lombok
•	Javax
•	Jstl
•	Jasper 

Project Structure:
•	Application Properties:
o	 Sign In (Port: 8080)
o	Sign up Service (Port: 8081)
o	Data Source Configuration
o	MVC configuration	
•	Pom.xml – dependencies 
•	Model:
o	Created User model class to represent user data.
•	Repository:
o	Used Extends JPARepository of Spring Data JPA 
o	Added List to find username and password.	
•	Controllers:
o	Implemented controllers for sign-up and sign-in functionalities.
o	 Implemented validation checks for duplicate usernames, password matching, etc.
•	Views:
o	Created JSP pages for sign-up and sign-in forms.
•	Microservice Communication done by RestTemplate to enabled communication between services.

Key Features:
•	RESTful APIs for sign-up and sign-in functionalities.
•	Input validation to ensure data integrity.
•	Separation of concerns through microservices architecture.
•	Utilization of Spring Boot for rapid application development.

Learning Points:
•	Understanding the benefits of microservices architecture.
•	Utilizing Spring Boot to accelerate development.
•	Implementing communication between microservices.
•	Handling data validation and error handling effectively.

Next Steps:
o	Implement additional security features (e.g., JWT authentication).
o	Enhance error handling and logging mechanisms.
o	Integrate with a centralized configuration server for better manageability.
o	Containerize services using Docker for easier deployment and scalability.

Conclusion:
This project provided valuable insights into microservices architecture and Spring Boot development. By implementing sign-up and sign-in functionalities, I gained hands-on experience in building scalable and efficient systems. I look forward to applying these learnings to future projects and seeking advice for further improvements.

