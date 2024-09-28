public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Anik Das", 20000, "anikdas18@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer= new Customer( "mampy","uidhghghdf");
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmailAddress());
        System.out.println(secondCustomer.getCreditLimit());

        Customer thirdCustomer = new Customer("joe","joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmailAddress());
        System.out.println(thirdCustomer.getCreditLimit());


    }
}
