package demo;

public class Visitor extends User{
    public Visitor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int numarZile() {
        return data3.zile()+5;
    }
}
