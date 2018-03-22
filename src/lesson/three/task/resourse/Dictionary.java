package lesson.three.task.resourse;

import lesson.three.task.model.Coordinate;

import java.time.LocalDate;


public final class Dictionary {
    public static final String[] port = {"Abidjan", "Alexandria", "Altamira",
            "Amsterdam", "Ancona", "Archangelsk", "Auckland", "Azov", "Bahia Blanca",
            "Barcelona", "Barranquilla", "Bergkvara", "Boulogne", "Bremen",
            "Brest", "Buenaventura", "Bunbury", "Calcutta", "Catania", "Cayman Island",
            "Chiba", "Darwin", "Delfzijl", "Dubai", "Echuca", "Ecuador", "Edan", "Elbag",
            "England", "Gdansk", "Gela", "Genova", "Gent", "Geraldton", "Germany",
            "Gibraltar", "Goteborg", "Guantanamo", "Ilheus", "Ilyichevsk", "Immingham",
            "Incheon", "India"};
    public static final String[] typeOfFuelForCars = {"A95", "A92", "Diesel"};
    public static final String[] typeOfAircraftEngine = {"Turbojet", "Solid fuel engine",
            "Rotor engine", "Pulsating engine"};
    public static final String[] typeOfFuelForShips = {"Gas, Diesel", "Petrol"};
    public static String getPort(){
        return port[(int)(Math.random()*port.length)];
    }
    public static Coordinate getCoordinate(){
        return new Coordinate(Math.random()*360-180, Math.random()*180-90);
    }
    public static double getPrice(){
        return (int)(200_000+Math.random()*800_000);
    }
    public static int getSpeed(){
        return (int)(120+Math.random()*380);
    }
    public static int getYear(){
        return LocalDate.now().getYear()-((int)(Math.random()*30));
    }
    public static int getPassengers(){
        return (int)(Math.random()*400);
    }
    public static double getHeight(){
        return Math.random()*2000;
    }
    public static String getTypeOfFuelForCars(){
        return typeOfFuelForCars[(int)(Math.random()*typeOfFuelForCars.length)];
    }
    public static int getCapacityOfFuel(){
        return (int)(1+Math.random()*5);
    }
    public static String getTypeOfAircraftEngine(){
        return typeOfAircraftEngine[(int)(Math.random()*typeOfAircraftEngine.length)];
    }
    public static String getTypeOfFuelForShips(){
        return typeOfFuelForShips[(int)(Math.random()*typeOfFuelForShips.length)];
    }

}
