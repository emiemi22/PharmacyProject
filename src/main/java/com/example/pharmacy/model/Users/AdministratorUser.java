package com.example.pharmacy.model.Users;

public class AdministratorUser extends BasicUser{
    public AdministratorUser(String firstName, String lastName, String emailAddress, String password, String role) {
        super(firstName, lastName, emailAddress, password,role);
    }
}
