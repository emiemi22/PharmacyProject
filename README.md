# PharmacyProject
Here I am developing an online pharmacy. Now the project is in developing on the backend side using SpringBoot. 

The project is structurated in API Layer, Service Layer and Data Access Layer.
For API Layer it is used classes, e.g:ProductController where the requests are divided in categories: GET, POST, DELETE; 
using annotation for mapping all the incoming HTTP request URLs to the corresponding controller methods.

For building a Service Layer it is used @Service annotation, which is used for classes that provide some business functionalities. 
Practically it makes the connection between requests and what to extract from data base.

In Data Layer Access, as the name says, the Data Base it is accessed. Here we can write Queries in JPQL(similar to SQL), and get what we want from DB. 
JRaRepository helps us with methods such as: findAll, save, findById already implemented. For DB I used MySQL WorkBench.

So, this project it is able to receive a REQUEST and obtain different types of RESPONES. 
The workflow it is: REQUEST --> API LAYER --> SERVICE LAYER --> DATA ACCESS LAYER -> DB.
For testing the application, I used Intelliji HTTP request for a quick verification and PostMan.

