package com.example.pharmacy.model.Users;

import javax.persistence.*;

/**
 * The type Basic user.
 */
@Table
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BasicUser {
    /**
     * The Id.
     */
    @Id
    @SequenceGenerator(
            name = "user_seq",sequenceName = "user_seq" , allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="user_sequence"
    )

    Long id;
    /**
     * The First name.
     */
    String firstName;
    /**
     * The Last name.
     */
    String lastName;
    /**
     * The Email address.
     */
    String emailAddress;
    /**
     * The Password.
     */
    String password;
    /**
     * The Role.
     */
    String role;
    @Column(name="DTYPE",insertable=false, updatable=false)
    String dtype;


    /**
     * Instantiates a new Basic user.
     *
     * @param id           the id
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     * @param role         the role
     */
    public BasicUser(Long id,String firstName, String lastName, String emailAddress, String password, String role){
        this.id = id ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.role = role;
    }

    /**
     * Instantiates a new Basic user.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     * @param role         the role
     */
    public BasicUser(String firstName, String lastName, String emailAddress, String password, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.role = role;
    }
    public BasicUser(String firstName, String lastName, String emailAddress, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    /**
     * Instantiates a new Basic user.
     */
    public BasicUser() {

    }
    public void action(){

    }
}
