public class Worker {
    private String birth;
    private String birthDate;
    private String endDate;

    public Worker(String birth, String birthDate, String endDate) {
        this.birth = birth;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge( int currentYear, int birthYear){
        currentYear = 2025;
        birthYear = 1999;
        return (currentYear - birthYear);
    }
    public double collectPay(){
         return 0.0;
    }
//    public String endDate(){
//
//    }
}
