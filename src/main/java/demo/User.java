package demo;

public abstract class User {
    String firstName ;
    String lastName ;
    //public Data data = new Data();
    //public DataSource data2 = new Data();
    public DataSource data3 ;
    public User(String firstName, String lastName){
        this.firstName = firstName ;
        this.lastName = lastName;
        data3 = new Data();
    }
    public abstract int numarZile();
}
