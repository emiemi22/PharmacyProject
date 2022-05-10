package com.example.pharmacy.model.Users;

import javax.persistence.*;

/**
 * The type Client user.
 */
@Entity
public class ClientUser extends BasicUser{
    /**
     * Instantiates a new Client user.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     * @param role         the role
     */


    public ClientUser(String firstName, String lastName, String emailAddress, String password, String role) {
        super(firstName, lastName, emailAddress, password, role);
    }

    public ClientUser() {

    }

}
