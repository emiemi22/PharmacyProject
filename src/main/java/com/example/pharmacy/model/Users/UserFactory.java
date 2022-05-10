package com.example.pharmacy.model.Users;

/**
 * The type User factory.
 */
public class UserFactory {
    /**
     * Construct basic user basic user.
     *
     * @param role         the role
     * @param firstName    the first name
     * @param lastName     the last name
     * @param emailAddress the email address
     * @param password     the password
     * @return the basic user
     */
    public BasicUser constructBasicUser(String role, String firstName, String lastName, String emailAddress, String password){
        if(role.compareTo("EMPLOYEE") == 0){
            return new EmployeeUser(firstName,lastName,emailAddress,password, role);
        }
        if(role.compareTo("CLIENT") == 0){
            return new ClientUser(firstName,lastName,emailAddress,password,role);
        }
        return null ;
    }
}
