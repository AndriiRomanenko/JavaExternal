package lesson.three.task.model;

public class Ship extends Vehicle {
    private String registryPort;
    private int numberOfPassengers;
    public Ship(Coordinate coordinates, double price, int speed, int yearOfIssue,
                String registryPort, int numberOfPassengers) {
        super(coordinates, price, speed, yearOfIssue);
        this.registryPort = registryPort;
        this.numberOfPassengers = numberOfPassengers;
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

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + super.getPrice() +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ", registryPort: " + registryPort  +
                ", numberOfPassengers: " + numberOfPassengers +
                ']';
    }
}
