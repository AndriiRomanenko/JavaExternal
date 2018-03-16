package lesson.three.task.model;

public class Plane extends Vehicle {
    private double height;
    private int numberOfPassengers;
    public Plane(Coordinate coordinates, double price, int speed,
                 int yearOfIssue, double height, int numberOfPassengers) {
        super(coordinates, price, speed, yearOfIssue);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
                ", height: " + height +
                ", numberOfPassengers: " + numberOfPassengers +
                ']';
    }
}
