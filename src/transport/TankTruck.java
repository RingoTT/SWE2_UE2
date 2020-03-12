package transport;

public class TankTruck extends Transporter {

    public TankTruck(String name, int costPerKM, int maxLoad, Location location) {
        super(name, costPerKM, maxLoad, location);
    }

    @Override
    public void load(Cargo cargo) throws InvalidCargoException, OverloadedException {
        if (cargo.type == CargoType.SOLID) {
            throw new InvalidCargoException("Tanktruck can't transport solid cargo");
        } else {
            super.load(cargo);
        }
    }

    @Override
    public double goTo(Location location) throws UnreachableLocationException {
        if (!super.location.reachableOverland(location)) {
            throw new UnreachableLocationException("TankTruck can't swim");
        } else {
            double x = Math.round(this.costPerKM * this.location.getDistance(location) * 100) / 100.0;
            this.location = location;
            return x;
        }
    }
}

