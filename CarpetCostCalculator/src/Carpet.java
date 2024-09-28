public class Carpet {
    private double cost;

    // Constructor.....
    public Carpet(double cost) {
        this.cost = cost;
    }

    // Getter and setter....
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost<0){
            cost = 0;
        }
        this.cost = cost;
    }

    // Public Method...

}
