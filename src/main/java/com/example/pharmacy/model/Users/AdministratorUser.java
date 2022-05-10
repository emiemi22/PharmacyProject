package com.example.pharmacy.model.Users;

import javax.persistence.*;

/**
 * The type Administrator user.
 */

public class AdministratorUser extends BasicUser{

    private long id ;
    /**
     * Instantiates a new Administrator user.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     */
    public AdministratorUser(String firstName, String lastName, String emailAddress, String password) {
        super(firstName, lastName, emailAddress, password);
    }

    public AdministratorUser() {

    }

}
