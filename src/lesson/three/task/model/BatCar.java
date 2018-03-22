package lesson.three.task.model;

import lesson.three.task.service.IFly;
import lesson.three.task.service.IMove;
import lesson.three.task.service.ISwim;

public class BatCar extends Vehicle implements ISwim, IMove, IFly {
    private double height;
    private Engine engine;
    public BatCar(Coordinate coordinates, double price, int speed, int yearOfIssue,
                  double height, String typeOfEngine) {
        super(coordinates, price, speed, yearOfIssue);
        this.height = height;
        this.engine = new BatCar.Engine(typeOfEngine);
    }
    public class Engine{
        private String typeOfEngine;
        public Engine(String typeOfEngine){
            this.typeOfEngine = typeOfEngine;
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
                ", height: " + String.format("%.2f",height) +
                ", type of engine: " + engine.typeOfEngine +
                ']';
    }
}
