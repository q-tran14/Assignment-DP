package FlyweightPattern;

public class Car { // Context
    public String owner, id;
    CarType type;

    public Car(String owner, String id, CarType type) {
        this.owner = owner;
        this.id = id;
        this.type = CarFactory.getFlyweight(type);
    }

    public Car(CarType type) {
        this.owner = null;
        this.id = null;
        this.type = CarFactory.getFlyweight(type);
    }

    public void renderCar() {
        type.renderCar(owner,id);
    }
}
