package FlyweightPattern;

import java.util.ArrayList;

public class Test { //Client
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(new CarType ("Chevrolet","Camaro2018","pink" )));
        cars.add(new Car(new CarType ("Mercedes Benz","C300","black" )));
        cars.add(new Car(new CarType ("Mercedes Benz","C500","red" )));
        cars.add(new Car(new CarType ("BMW","M5","red" )));
        cars.add(new Car(new CarType ("BMW","X6","white" )));

        for (Car car : cars) {
            car.renderCar();
        }

        CarFactory.displayFlyweights();
        System.out.println("===================================================================");
        Car c1 = new Car("CL234IR","James Doe",new CarType("BMW","M5","red"));
        CarFactory.displayFlyweights();
        Car c2 = new Car("CL234IR","James Doe",new CarType("BMW","X1","red"));
        c1.renderCar();
        c2.renderCar();

        CarFactory.displayFlyweights();
    }
}
