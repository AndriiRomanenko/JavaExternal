package lesson.three.task.model;

import lesson.three.task.service.ISwim;

public class Ship extends Vehicle implements ISwim {
    private String registryPort;
    private int numberOfPassengers;
    private Engine engine;
    public Ship(Coordinate coordinates, double price, int speed, int yearOfIssue,
                String registryPort, int numberOfPassengers, String fuel) {
        super(coordinates, price, speed, yearOfIssue);
        this.registryPort = registryPort;
        this.numberOfPassengers = numberOfPassengers;
        this.engine = new Ship.Engine(fuel);
    }

    public String getRegistryPort() {
        return registryPort;
    }

    public void setRegistryPort(String registryPort) {
        this.registryPort = registryPort;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public class Engine {
        private String typeOfFuel;
        public Engine(String typeOfFuel){
            this.typeOfFuel = typeOfFuel;
        }
    }
    public Engine getEngine(){ return engine; }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + String.format("%.2f",super.getPrice()) +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ", registryPort: " + registryPort  +
                ", numberOfPassengers: " + numberOfPassengers +
                ", type of fuel: " + engine.typeOfFuel +
                ']';
    }
}
