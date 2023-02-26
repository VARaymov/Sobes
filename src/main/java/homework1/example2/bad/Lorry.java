package homework1.example2.bad;

public class Lorry extends Car implements Movable, Stoppable {
    @Override
    void open() {

    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
