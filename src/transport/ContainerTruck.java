package transport;

public class ContainerTruck extends Transporter {
    public ContainerTruck(String name, int costPerKM, int maxLoad, Location location) {
        super(name, costPerKM, maxLoad, location);
    }
    @Override
    public void load(Cargo cargo) throws InvalidCargoException, OverloadedException {
        if (cargo.type == CargoType.LIQUID) {
            throw new InvalidCargoException("ContainerTruck can't transport liquid cargo");
        } else {
            super.load(cargo);
        }
    }

    @Override
    public double goTo(Location location) throws UnreachableLocationException {
        if (super.location.reachableOverland(location)) {
            double x = Math.round(this.costPerKM * this.location.getDistance(location) * 100) / 100.0;
            this.location = location;
            return x;
        } else {
            throw new UnreachableLocationException("ContainerTruck can't swim");
        }
    }
}
