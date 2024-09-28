public class Main2 {
    public static void main(String[] args) {
       Person person=new Person();

       person.setFirstName("Anik");
       person.setLastName("Das");
       person.setAge(25);

        System.out.println("Person is Teen ? :" + person.isTeen());
        System.out.println("Full Name is :" + person.getFullName());

        Person person1 = new Person();

        person1.setFirstName("Mumpy");
        person1.setLastName("Biswas");
        person1.setAge(15);

        System.out.println("Person1 is Teen ? :" + person1.isTeen());
        System.out.println("Full Name is :" + person1.getFullName());


    }
}
