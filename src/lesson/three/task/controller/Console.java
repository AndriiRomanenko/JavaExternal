package lesson.three.task.controller;

import lesson.three.task.factory.VehicleFactory;

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
        loadData(15);
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello\nSelect operation from " +
                    "the list by entering the number of the method");
            int numberOfMethod;
            boolean isExit = false;
            while (!isExit) {
                System.out.println("\n1. Display array with vehicles.");
                System.out.println("2. Find vehicle with the highest price.");
                System.out.println("3. Find the mechanism year of release 2000-2005 with a speed " +
                        "above 150 km / h, and the lowest price");
                System.out.println("4. From the Mass Vehicle to receive an array of " +
                        "Car not older than 5 years");
                System.out.println("5. From the Mass Vehicle to receive the Ship array " +
                        "not older than 5 years, with a sorted price in descending order");
                System.out.println("6. Create sequences IFly, ISwim, IMove and display ");
                System.out.println("7. Sort IFly by ascending");
                System.out.println("8. Sort IFly by descending");
                System.out.println("9. Sort IMove by ascending");
                System.out.println("10. Sort IMove by descending");
                System.out.println("11. Sort ISwim by ascending");
                System.out.println("12. Sort ISwim by descending");
                System.out.println("13. Exit");
                numberOfMethod = scanner.nextInt();
                switch (numberOfMethod) {
                    case 1:
                        System.out.println();
                        handler.displayArray(handler.getArray());
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
                    case 6:
                        System.out.println("[FLY]");
                        handler.displayArray(handler.getCanFly());
                        System.out.println();
                        System.out.println("[MOVE]");
                        handler.displayArray(handler.getCanMove());
                        System.out.println();
                        System.out.println("[SWIM]");
                        handler.displayArray(handler.getCanSwim());
                        System.out.println();
                        break;
                    case 7:
                        handler.ascendingSortBySpeed(handler.getCanFly());
                        break;
                    case 8:
                        handler.descendingSortBySpeed(handler.getCanFly());
                        break;
                    case 9:
                        handler.ascendingSortBySpeed(handler.getCanMove());
                        break;
                    case 10:
                        handler.descendingSortBySpeed(handler.getCanMove());
                        break;
                    case 11:
                        handler.ascendingSortBySpeed(handler.getCanSwim());
                        break;
                    case 12:
                        handler.descendingSortBySpeed(handler.getCanSwim());
                        break;
                    case 13:
                        System.out.println("Good bye!");
                        isExit = true;
                        break;
                    default:
                        System.out.println("You entered wrong number of method");
                        break;
                }
            }
        }
    }
    public void loadData(int numberOfVehicle){
        loadVehicle(numberOfVehicle);
        handler.setCanFly();
        handler.setCanMove();
        handler.setCanSwim();
    }
    private void loadVehicle(int n){
        VehicleFactory factory = new VehicleFactory();
        for (int i = 0; i<n;i++){
            handler.add(factory.randomVehicle());
        }
    }
}
