package com.example.pharmacy.model.Users;

public class UserFactory {
    public BasicUser constructBasicUser(Role role, String firstName, String lastName, String emailAddress, String password){
        if(role.compareTo(Role.EMPLOYEE) == 0){
            return new EmployeeUser(firstName,lastName,emailAddress,password,"Employee");
        }
        if(role.compareTo(Role.ADMINISTRATOR) == 0){
            return new AdministratorUser(firstName,lastName,emailAddress,password,"Administrator");
        }
        if(role.compareTo(Role.CLIENT) == 0){
            return new ClientUser(firstName,lastName,emailAddress,password,"Client");
        }
        return null ;
    }
}
