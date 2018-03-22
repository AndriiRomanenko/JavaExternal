package lesson.three.task.controller;

import lesson.three.task.model.Car;
import lesson.three.task.model.Ship;
import lesson.three.task.model.Vehicle;
import lesson.three.task.service.ICan;
import lesson.three.task.service.IFly;
import lesson.three.task.service.IMove;
import lesson.three.task.service.ISwim;

import java.time.LocalDate;

public class VehicleHandler {
    private Vehicle[] array;
    private int size;
    private IFly[] canFly;
    private IMove[] canMove;
    private ISwim[] canSwim;
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

    public Vehicle[] getArray() {
        return array;
    }

    public void getCarNoOlder5Years(){
        display(sortCars(array));
    }

    public <T> void displayArray(T[] array){
        display(array);
    }

    private <T> void display(T[] array){
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

    public int getMinSpeed(Vehicle[] array){
        return minSpeed(array);
    }

    public int getMaxSpeed(Vehicle[] array){
        return maxSpeed(array);
    }

    private int minSpeed(Vehicle[] array){
        Vehicle minSpeed = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] instanceof Vehicle && minSpeed.getSpeed() > array[i].getSpeed()) {
                minSpeed = array[i];
            }
        }
        return minSpeed.getSpeed();
    }

    private int maxSpeed(Vehicle[] array){
        Vehicle maxSpeed = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] instanceof Vehicle && maxSpeed.getSpeed() < array[i].getSpeed()) {
                maxSpeed = array[i];
            }
        }
        return maxSpeed.getSpeed();
    }

    public IFly[] getCanFly(){
        return canFly = getFly(array);
    }

    public IMove[] getCanMove(){
        return canMove = getMove(array);
    }

    public ISwim[] getCanSwim(){
       return canSwim = getSwim(array);
    }

    private IFly[] getFly(Vehicle[] array){
        IFly[] temp = new IFly[array.length];
        int size = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] instanceof IFly){
                temp[size] = (IFly)array[i];
                size++;
            }
        }
        System.arraycopy(temp, 0,temp, 0, size);
        return temp;
    }

    private IMove[] getMove(Vehicle[] array){
        IMove[] temp = new IMove[array.length];
        int size = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] instanceof IMove){
                temp[size] = (IMove)array[i];
                size++;
            }
        }
        System.arraycopy(temp, 0,temp, 0, size);
        return temp;
    }

    private ISwim[] getSwim(Vehicle[] array){
        ISwim[] temp = new ISwim[array.length];
        int size = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] instanceof ISwim){
                temp[size] = (ISwim) array[i];
                size++;
            }
        }
        System.arraycopy(temp, 0,temp, 0, size);
        return temp;
    }

    public void ascendingSortBySpeed(ICan[] array){
        ascendingSort(array);
    }

    public void descendingSortBySpeed(ICan[] array){
        ascendingSort(array);
    }

    private void ascendingSort(ICan[] array){
        Vehicle max;
        for(int i = 0; i<array.length-1; i++){
            max = (Vehicle)array[i];
            for(int j = i+1; j<array.length; j++){
                Vehicle searchElement = (Vehicle)array[j];
                if (searchElement instanceof Vehicle &&
                        searchElement.getSpeed() > max.getSpeed()) {
                    max = searchElement;
                }
                swap(searchElement,max);
            }
        }
    }

    private void descendingSort(ICan[] array){
        Vehicle min;
        for(int i = 0; i<array.length-1; i++){
            min = (Vehicle)array[i];
            for(int j = i+1; j<array.length; j++){
                Vehicle searchElement = (Vehicle)array[j];
                if (searchElement instanceof Vehicle &&
                        searchElement.getSpeed() < min.getSpeed()) {
                    min = searchElement;
                }
                swap(searchElement,min);
            }
        }
    }

}
