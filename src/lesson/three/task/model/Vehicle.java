package lesson.three.task.model;

public abstract class Vehicle {
    private Coordinate coordinates;
    private double price;
    private int speed;
    private int yearOfIssue;
    public Vehicle(Coordinate coordinates, double price, int speed, int yearOfIssue) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearOfIssue = yearOfIssue;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + coordinates +
                ", price: " + price +
                ", speed: " + speed +
                ", yearOfIssue: " + yearOfIssue +
                ']';
    }
}
