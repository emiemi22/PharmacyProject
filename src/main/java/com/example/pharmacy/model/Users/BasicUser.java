package com.example.pharmacy.model.Users;

import javax.persistence.*;

@Entity
@Table
public abstract class BasicUser {
    @Id
    @SequenceGenerator(
            name = "user_seq", sequenceName = "user_seq", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    Long id;
    String firstName;
    String lastName;
    String emailAddress;
    String password;
    String role;
    public BasicUser(Long id,String firstName, String lastName, String emailAddress, String password, String role){
        this.id = id ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.role = role;
    }
    public BasicUser(String firstName, String lastName, String emailAddress, String password, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.role = role;
    }

    public BasicUser() {

    }
}
