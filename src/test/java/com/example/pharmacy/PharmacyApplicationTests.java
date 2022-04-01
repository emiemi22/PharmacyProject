package com.example.pharmacy;

import demo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

// here we put testing code
@SpringBootTest
class PharmacyApplicationTests {
    @Test
    void contextLoads() {
        FactoryUser factoryUser = new FactoryUser();
        User user = factoryUser.constructUser(Roles.EMPLOYEE,"Andrei","Burian");
        User expectedUser = new Employee("Andrei","Burian");
        assertEquals(user,expectedUser);
    }

}
