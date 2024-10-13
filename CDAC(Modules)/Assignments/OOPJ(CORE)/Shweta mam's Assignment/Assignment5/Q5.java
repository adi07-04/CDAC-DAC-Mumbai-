
class Vehicles{
    void startEngine(){
        System.out.println("Engine started");
    }
    void stopEngine(){
        System.out.println("Engine stopped");
    }
}

class Cars extends Vehicles{
    void startEngine(){
        System.out.println("Car Engine started");
    }
    void stopEngine(){
        System.out.println(" car Engine stopped");
    }
}

class Motorcycle extends Vehicles{
    void startEngine(){
        System.out.println(" Motorcycle Engine started");
    }
    void stopEngine(){
        System.out.println(" Motorcycle Engine stopped");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Vehicles car = new Cars();
        car.startEngine();
        car.stopEngine();
    }
}
