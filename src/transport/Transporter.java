package transport;

public abstract class Transporter {

    int maxLoad;
    String name;
    double costPerKM;
    Location location;
    Cargo cargo;

    public Transporter(int maxLoad, String name, double costPerKM, Location location, Cargo cargo) {
        super();
        this.maxLoad = maxLoad;
        this.name = name;
        this.costPerKM = costPerKM;
        this.location = location;
        this.cargo = cargo;
    }

    double goTo(Location location) {
        return this.costPerKM * this.location.getDistance(location);
    }
    void load(Cargo cargo) throws OverloadedException {//throws OverloadedException if cargo is heavier than maxLoad
        if (cargo.weight > this.maxLoad){
            throw new OverloadedException("Cargo too heavy");
        }
    }
    @Override
    public String toString() {
        return name + " "+maxLoad+" "+costPerKM+" "+location+" "+cargo;
    }
}
