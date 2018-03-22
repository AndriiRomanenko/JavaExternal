package lesson.three.task.model;

import lesson.three.task.service.IFly;
import lesson.three.task.service.IMove;
import lesson.three.task.service.ISwim;


public class Amphibian extends Vehicle implements ISwim, IMove {
    private Engine engine;
    public Amphibian(Coordinate coordinates, double price, int speed, int yearOfIssue,
            String fuel) {
        super(coordinates, price, speed, yearOfIssue);
        this.engine = new Engine(fuel);
    }
    static class Engine{
        private String typeOfFuel;
        public Engine(String typeOfFuel){
            this.typeOfFuel = typeOfFuel;
        }
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + String.format("%.2f",super.getPrice()) +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ", type of fuel: " + engine.typeOfFuel +
                ']';
    }

}
