package lesson.three.task.controller;

import lesson.three.task.model.Car;
import lesson.three.task.model.Coordinate;
import lesson.three.task.model.Plane;
import lesson.three.task.model.Ship;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    private static Console instance = null;
    private VehicleHandler handler;
    private Console(){
        this.handler = new VehicleHandler();
    }
    public static Console getInstance(){
        if(instance == null){
            instance = new Console();
        }
        return instance;
    }
    public void start(){
        loadData();
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello\nSelect operation from " +
                    "the list by entering the number of the method");
            int numberOfMethod;
            boolean isExit = false;
            while (!isExit) {
                System.out.println("1. Display array with vehicles.");
                System.out.println("2. Find vehicle with the highest price.");
                System.out.println("3. Find the mechanism year of release 2000-2005 with a speed " +
                        "above 150 km / h, and the lowest price");
                System.out.println("4. From the Mass Vehicle to receive an array of " +
                        "Car not older than 5 years");
                System.out.println("5. From the Mass Vehicle to receive the Ship array " +
                        "not older than 5 years, with a sorted price in descending order");
                numberOfMethod = scanner.nextInt();
                switch (numberOfMethod) {
                    case 1:
                        handler.displayVehicles();
                        break;
                    case 2:
                        handler.getMaxPrice();
                        break;
                    case 3:
                        handler.getVehicleByYearSpeedAndMinPrice();
                        break;
                    case 4:
                        handler.getCarNoOlder5Years();
                        break;
                    case 5:
                        handler.getShipByYearAndPrice();
                        break;
                    default:
                        System.out.println("You entered wrong number of method");
                        break;
                }
                boolean choiceFlag = true;
                while (choiceFlag) {
                    System.out.println("Are you want continue?\n1. Yes\n2. No");
                    int choice = scanner.nextInt();
                    if (choice != 2 && choice != 1) {
                        System.out.println("You entered wrong number");
                    }
                    if (choice == 2) {
                        choiceFlag = false;
                        isExit = true;
                    }
                    if (choice == 1) {
                        choiceFlag = false;
                    }
                }
            }
            System.out.println("Good bye!");
        }
    }
    public void loadData(){
        handler.add(new Car(new Coordinate(5,7), 12000, 170, 2007));
        handler.add(new Car(new Coordinate(5,7), 15000, 190, 2013));
        handler.add(new Car(new Coordinate(5,7), 24000, 210, 2015));
        handler.add(new Car(new Coordinate(5,7), 26000, 230, 2016));
        handler.add(new Car(new Coordinate(5,7), 10000, 160, 2005));
        handler.add(new Car(new Coordinate(5,7), 43000, 250, 2016));
        handler.add(new Plane(new Coordinate(60,53), 150000, 450,
                2007, 1000, 80 ));
        handler.add(new Plane(new Coordinate(60,53), 210000, 600,
                2014, 2000, 100 ));
        handler.add(new Plane(new Coordinate(60,53), 300000, 750,
                2016, 3000, 80 ));
        handler.add(new Plane(new Coordinate(60,53), 100000, 400,
                2009, 1000, 80 ));
        handler.add(new Ship(new Coordinate(6,43), 200000, 200, 2000,
                "Istanbul", 300));
        handler.add(new Ship(new Coordinate(6,43), 250000, 300, 2015,
                "Cyprus", 300));
        handler.add(new Ship(new Coordinate(6,43), 450000, 350, 2016,
                "Sydney", 300));
        handler.add(new Ship(new Coordinate(6,43), 500000, 370, 2017,
                "Malta", 300));
    }
}
