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
        loadData(10);
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
                System.out.println("6. Create sequences IFly, ISwim, IMove ");
                numberOfMethod = scanner.nextInt();
                switch (numberOfMethod) {
                    case 1:
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
                        interfaceSequences();
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
    public void loadData(int numberOfVehicle){
        loadVehicle(numberOfVehicle);
    }
    private void loadVehicle(int n){
        VehicleFactory factory = new VehicleFactory();
        for (int i = 0; i<n;i++){
            handler.add(factory.randomVehicle());
        }
    }
    private void interfaceSequences(){
        try(Scanner scanner = new Scanner(System.in)){
            int numberOfMethod;
            boolean isExit = false;
            while (!isExit) {
                System.out.println("Select operation from " +
                        "the list by entering the number of the method");
                System.out.println("1. Display interfaces.");
                System.out.println("2. Sort IFly by ascending");
                System.out.println("3. Sort IFly by descending");
                System.out.println("4. Sort IMove by ascending");
                System.out.println("5. Sort IMove by descending");
                System.out.println("6. Sort ISwim by ascending");
                System.out.println("7. Sort ISwim by descending");
                numberOfMethod = scanner.nextInt();
                switch (numberOfMethod) {
                    case 1:
                        handler.displayArray(handler.getCanFly());
                        System.out.println();
                        handler.displayArray(handler.getCanMove());
                        System.out.println();
                        handler.displayArray(handler.getCanSwim());
                        System.out.println();
                        break;
                    case 2:
                        handler.ascendingSortBySpeed(handler.getCanFly());
                        handler.displayArray(handler.getCanFly());
                        break;
                    case 3:
                        handler.descendingSortBySpeed(handler.getCanFly());
                        handler.displayArray(handler.getCanFly());
                        break;
                    case 4:
                        handler.ascendingSortBySpeed(handler.getCanMove());
                        handler.displayArray(handler.getCanMove());
                        break;
                    case 5:
                        handler.descendingSortBySpeed(handler.getCanMove());
                        handler.displayArray(handler.getCanMove());
                        break;
                    case 6:
                        handler.ascendingSortBySpeed(handler.getCanSwim());
                        handler.displayArray(handler.getCanSwim());
                        break;
                    case 7:
                        handler.descendingSortBySpeed(handler.getCanSwim());
                        handler.displayArray(handler.getCanSwim());
                        break;
                    default:
                        System.out.println("You entered wrong number");
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
        }
    }
}
