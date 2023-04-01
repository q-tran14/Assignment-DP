package FlyweightPattern;

import java.util.HashMap;

public class CarFactory { // FlyweightFactory
    private static HashMap<String, CarType> flyweights = new HashMap<String, CarType>();

    private static String getKey(CarType repeatingState) {
        return repeatingState.toString();
    }

    public static CarType getFlyweight(CarType repeatingState){
        if (flyweights.get(getKey(repeatingState))==null){
            System.out.println(flyweights.containsValue(repeatingState));
            System.out.println("Doesn't have this one, create a new one");
            flyweights.put(getKey(repeatingState), repeatingState);
        }else {
            System.out.println("Already have: " + repeatingState.toString());
        }
        return flyweights.get(getKey(repeatingState));
    }

    public static void displayFlyweights(){
        System.out.println(flyweights.size() + " Flyweight.\n");
        for (String s : flyweights.keySet()) {
            System.out.println(s);
        }
    }
}
