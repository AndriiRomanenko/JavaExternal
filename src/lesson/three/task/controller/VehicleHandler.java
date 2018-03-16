package lesson.three.task.controller;

import lesson.three.task.model.Car;
import lesson.three.task.model.Ship;
import lesson.three.task.model.Vehicle;

import java.time.LocalDate;

public class VehicleHandler {
    private Vehicle[] array;
    private int size;
    public VehicleHandler(){
        this.array = new Vehicle[5];
        this.size = 0;
    }

    public void add(Vehicle vehicle){
        if (size < array.length-1){
            array[size] = vehicle;
            ++size;
        } else {
            increaseArray();
            array[size] = vehicle;
            ++size;
        }
    }
    private void increaseArray(){
        int oldCapacity = array.length;
        int newCapacity = (oldCapacity * 3)/2+1;
        Vehicle[] temp;
        if(newCapacity - oldCapacity>0){
            temp = new Vehicle[newCapacity];
        } else {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, 0,temp, 0, size);
        array = temp;
    }

    public void getCarNoOlder5Years(){
        display(sortCars(array));
    }
    public void displayVehicles(){
        display(array);
    }
    private void display(Vehicle[] array){
        for(int i = 0; i<array.length; i++){
            if(array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }
    private void display(Vehicle vehicle){
        System.out.println(vehicle);
    }
    private Car[] sortCars(Vehicle[] array){
        Car[] temp = new Car[array.length];
        int tempCount = 0;
        int searchYear = 5;
        for (int i = 0; i<array.length; i++){
            if(array[i] instanceof Car
                    && ((LocalDate.now().getYear()-array[i].getYearOfIssue())<=searchYear)){
                temp[tempCount++] = (Car)array[i];
            }
        }
        System.arraycopy(temp,0,temp,0,tempCount);
        return temp;
    }
    public void getMaxPrice(){
        display(maxPrice(array));
    }
    private Vehicle maxPrice(Vehicle[] array){
        Vehicle maxPrice = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] instanceof Vehicle && maxPrice.getPrice() < array[i].getPrice()) {
                maxPrice = array[i];
            }
        }
        return maxPrice;
    }
    public void getVehicleByYearSpeedAndMinPrice(){
        display(vehicleByYearSpeedAndMinPrice(array));
    }
    private Vehicle vehicleByYearSpeedAndMinPrice(Vehicle[] array){
        int minYear = 2000;
        int maxYear = 2005;
        int speed = 150;
        Vehicle temp = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] instanceof Vehicle &&
                    (array[i].getYearOfIssue() >= minYear
                    && array[i].getYearOfIssue() <= maxYear )
                    && array[i].getSpeed() > speed
                    && array[i].getPrice() < temp.getPrice()){
                temp = array[i];
            }
        }
        return temp;
    }
    public void getShipByYearAndPrice(){
        display(getShips(array));
    }
    private Ship[] getShips(Vehicle[] array){
        Ship[] temp = new Ship[array.length];
        int tempCount = 0;
        int searchYear = 5;
        for (int i = 0; i<array.length; i++){
            if(array[i] instanceof Ship
                    && ((LocalDate.now().getYear()-array[i].getYearOfIssue())<=searchYear)){
                temp[tempCount++] = (Ship)array[i];
            }
        }
        System.arraycopy(temp,0,temp,0,tempCount);
        sortByDescending(temp);
        return temp;

    }
    private void sortByDescending(Vehicle[] array){
        Vehicle max;
        for(int i = 0; i<array.length-1; i++){
            max = array[i];
            for(int j = i+1; j<array.length; j++){
                if (array[j] instanceof Vehicle &&
                        array[j].getPrice() > max.getPrice()) {
                    max = array[j];
                }
                swap(array[i],max);
            }
        }
    }

    private void swap(Vehicle one, Vehicle two){
        Vehicle temp = one;
        one = two;
        two = temp;
    }
}
