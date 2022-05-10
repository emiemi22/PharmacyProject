I am developing an online pharmacy. Now the project is in development on the backend side using SpringBoot.
The project is structurated in API Layer, Service Layer and Data Access Layer. For API Layer it is used classes, e.g:ProductController where the requests are divided in categories: GET, POST, DELETE, PUT; using annotation for mapping all the incoming HTTP request URLs to the corresponding controller methods.

For building a Service Layer it is used @Service annotation, which is used for classes that provide some business functionalities. Practically it makes the connection between requests and what to extract from database.

In Data Layer Access, as the name says, the Data Base it is accessed. Here we can write Queries in JPQL(similar to SQL), and get what we want from DB. JRaRepository helps us with methods such as: findAll, save, and findById already implemented. For DB I used MySQL WorkBench.
So, this project it is able to receive a REQUEST and obtain different types of RESPONSE.

The workflow it is: REQUEST --> API LAYER --> SERVICE LAYER --> DATA ACCESS LAYER -> DB. For testing the application, I used Intelliji HTTP request for quick verification and PostMan.

Now with an architectural modification in the Repository layer, the project it is no longer dependent on a DataBase. We can extract information from any other source, such as CSV, XML, so on.

For each layer in application, Controller, Service, Data Access, I created for each class, Product or Producer a UnitTest. Why? To test and to be sure individual unit or component functionalities are working fine. In order to do that I used the framework MOCKITO because allow us the concept of MOCKING which is a process of developing the objects that act as a clone of the real objects. In other words, mocking is a testing technique where mock objects are used instead of real objects for testing purposes. Mock objects provide a specific (dummy) output for a particular (dummy) input passed to them.

For testing the Controllers and Services, I used @Mock and @InjectedMock. @Mock creates a mock. @InjectMocks creates an instance of the class and injects the mocks that are created with the @Mock; in short, a Controller needs a Service, and a Service needs Repository. I tested for all the GET methods and the validation methods. To tell the mock what to return, I used the when().thenReturn() function, to have an output, and after that, the desired function is called on injected mock, and compare if the expected output is the same with the output; checked with assertThat, assertEquals.

I added a new table called Producer, which can be a way to develop more functionalities on the application, such as the stock for each drug, or the similar medicaments. Also supports REQUESTS, such as POST GET DELETE. In a future step, these requests could be done only by the administrator of the site. I tried at this point to create using a Factory Method Design Pattern, more types of users for the application, such as employees, clients, and administrator. Unfortunately, I did not succeed to implement it. No more excuses, I wanted to have those users for the app to have different functionalities. Such as, a client can order some product, an employee can add a new product/delete/update it, and an administrator can have access to the whole app DB.

There is a table called Order where an employee can select a product that is needed in the pharmacy, and send it to the producer to increase the stock of that product. Also when an order is made, the stock of that product is increased with quantity. And when an order has been canceled the stock of that product decrease. Basically, the table order has a foreign key to the product table and another foreign key to the producer.
