package demo;

public class FactoryUser {
    public User constructUser(Roles role, String firstName, String lastName){
        if (role.compareTo(Roles.EMPLOYEE) == 0){
            return new Employee(firstName,lastName);
        }
        if (role.compareTo(Roles.CONTRACTOR) == 1){
            return new Contractor(firstName,lastName);
        }
        if (role.compareTo(Roles.VISITOR) == 2){
            return new Visitor(firstName,lastName);
        }
           return null;
    }
}
