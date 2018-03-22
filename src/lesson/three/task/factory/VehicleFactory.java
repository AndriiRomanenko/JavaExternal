package lesson.three.task.factory;

import lesson.three.task.model.*;
import static lesson.three.task.resourse.Dictionary.*;

public class VehicleFactory {
    public Vehicle getVehicle(int n){
        switch (n){
            case 0:
                return new Car(getCoordinate(), getPrice(), getSpeed(), getYear(),
                        getTypeOfFuelForCars(), getCapacityOfFuel());
            case 1:
                return new Plane(getCoordinate(), getPrice(), getSpeed(), getYear(),
                        getHeight(), getPassengers(), getTypeOfAircraftEngine());
            case 2:
                return new Ship(getCoordinate(), getPrice(), getSpeed(), getYear(),
                        getPort(), getPassengers(), getTypeOfFuelForShips());
            case 3:
                return new Amphibian(getCoordinate(), getPrice(), getSpeed(), getYear(),
                        getTypeOfFuelForCars());
            case 4:
                return new BatCar(getCoordinate(), getPrice(), getSpeed(), getYear(),
                        getHeight(), getTypeOfAircraftEngine());
            default:
                return null;
        }
    }
    public Vehicle randomVehicle(){
        return getVehicle((int)(Math.random()*5));
    }
}
