public class Customer {

    // Create Field...
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Getter method....

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Public Method...

    public Customer( String name,double creditLimit,String emailAddress){
        this.name = name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public Customer( String name ,  String emailAddress ){
        this( name, 1000, emailAddress);
    }


}
