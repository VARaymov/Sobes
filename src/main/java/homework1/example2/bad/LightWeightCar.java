package homework1.example2.bad;

public class LightWeightCar extends Car implements Movable{
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
