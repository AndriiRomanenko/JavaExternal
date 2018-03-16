package lesson.three.task.model;


public class Car extends Vehicle {
    public Car(Coordinate coordinates, double price, int speed, int yearOfIssue) {
        super(coordinates, price, speed, yearOfIssue);
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + super.getPrice() +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ']';
    }
}
