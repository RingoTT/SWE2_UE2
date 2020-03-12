package transport;

public class TankTruck extends Transporter {

    public TankTruck(int maxLoad, String name, double costPerKM, Location location, Cargo cargo)throws InvalidCargoException {
        super(maxLoad, name, costPerKM, location, cargo);
        if (cargo.type == CargoType.SOLID){
            throw new InvalidCargoException("TankTruck can only be loaded with liquid cargo!");
        }
    }
}
