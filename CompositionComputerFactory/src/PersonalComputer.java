public class PersonalComputer extends Product {

    private Computercase computercase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String manufacturer, String model, Computercase computercase,
                            Monitor monitor, Motherboard motherboard) {
        super(manufacturer, model);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Computercase getComputercase() {
        return computercase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
