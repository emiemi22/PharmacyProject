package demo;

public class Contractor extends User{
    public Contractor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int numarZile() {
        return data3.zile()+23;
    }
}
