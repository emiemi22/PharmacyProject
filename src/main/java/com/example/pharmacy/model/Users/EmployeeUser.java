package com.example.pharmacy.model.Users;

import javax.persistence.*;

/**
 * The type Employee user.
 */
@Entity
public class EmployeeUser extends BasicUser{
    /**
     * Instantiates a new Employee user.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     */

    public EmployeeUser(String firstName, String lastName, String emailAddress, String password, String role) {
        super(firstName, lastName, emailAddress, password, role);
    }

    public EmployeeUser() {

    }
}
