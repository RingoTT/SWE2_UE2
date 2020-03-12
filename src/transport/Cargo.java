package transport;

public class Cargo {

    CargoType type;
    int weight;
    String description;

    Cargo(CargoType type,int weight,String description){
        this.type = type;
        this.weight = weight;
        this.description = description;
    }
}
