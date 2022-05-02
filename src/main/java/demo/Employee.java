package demo;

public class Employee extends User{

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int numarZile() {
        return data3.zile()*12;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       Employee e = (Employee)obj;
       return (this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName));
    }
}
