package transport;

public class ContainerTruck extends Transporter {
    public ContainerTruck(int maxLoad, String name, double costPerKM, Location location, Cargo cargo) {
        super(maxLoad, name, costPerKM, location, cargo);
    }
}
