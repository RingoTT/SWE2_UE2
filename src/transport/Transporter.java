package transport;

public class Transporter {

    int maxLoad;
    String name;
    double costPerKM;
    Location location;
    Cargo cargo;

    public Transporter(int maxLoad, String name, double costPerKM, Location location, Cargo cargo) {
        this.maxLoad = maxLoad;
        this.name = name;
        this.costPerKM = costPerKM;
        this.location = location;
        this.cargo = cargo;
    }

    double goTo(Location location) {
        this.location.getDistance(location);
        return 0;
    }
}
