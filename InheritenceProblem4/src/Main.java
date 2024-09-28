public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        employee.work();
        System.out.println("The Employee salary is " +employee.getSalary());

        HRManager hrManager = new HRManager( 70000);
        hrManager.addEmployee();
        hrManager.work();
        System.out.println("HRmaneger Salary is " + hrManager.getSalary());


    }
}
