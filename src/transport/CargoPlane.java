package transport;

public class CargoPlane extends Transporter {

    private final int constCost;

    public CargoPlane(int maxLoad, String name, double costPerKM, Location location, Cargo cargo, int constCost) {
        super(maxLoad, name, costPerKM, location, cargo);
        this.constCost = constCost;
    }
}
