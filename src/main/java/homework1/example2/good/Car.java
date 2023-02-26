package homework1.example2.good;

public abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public Car(Engine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    public void move() {
        System.out.println("Car is moving");
    }

    public void open() {
        System.out.println("Car is open");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
