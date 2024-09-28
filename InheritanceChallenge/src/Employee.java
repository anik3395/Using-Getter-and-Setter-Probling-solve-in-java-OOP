public class Employee extends Worker {

    private long employeeld;
    private String hireDate;

    public Employee(String birth, String birthDate, String endDate, long employeeld, String hireDate) {
        super(birth, birthDate, endDate);
        this.employeeld = employeeld;
        this.hireDate = hireDate;
    }
}


