package FlyweightPattern;

public class CarType { // Flyweight
    private String company, model, color;

    public CarType(String company, String model, String color) {
        this.company = company;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return company + "-" + model + '-' + color;
    }

    public void renderCar(String owner, String id)
    {
        System.out.println(owner + '-' + id + '-' + this.toString());
    }
}
