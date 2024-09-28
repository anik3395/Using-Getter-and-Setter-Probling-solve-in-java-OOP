public class HRManager extends  Employee {
    public HRManager(double salary) {
        super((int) salary);
    }

    public  void work(){
        System.out.println("working as an HR Manager!");
    }

    public void addEmployee(){
        System.out.println("Adding an employee.");
    }
}
