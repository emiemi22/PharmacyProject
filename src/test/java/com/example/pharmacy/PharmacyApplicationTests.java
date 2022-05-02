package com.example.pharmacy;

import demo.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static javax.management.Query.times;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// here we put testing code
@SpringBootTest
class PharmacyApplicationTests {
    @Mock
    DataSource dataSource;

    @Test
    void contextLoads() {
        FactoryUser factoryUser = new FactoryUser();
        User user = factoryUser.constructUser(Roles.EMPLOYEE,"Andrei","Burian");
        User expectedUser = new Employee("Andrei","Burian");
        assertEquals(user,expectedUser);
    }
    @Test
    void test2(){
        when(dataSource.zile()).thenReturn(2);
        FactoryUser factoryUser = new FactoryUser();
        User user = factoryUser.constructUser(Roles.EMPLOYEE,"Dragos" , "Contiu");
        user.data3 = dataSource;
        int result = user.numarZile();
        assertEquals(12*2,result);
        verify(dataSource, Mockito.times(1)).zile();
    }

}
