package lesson.three.task.controller;

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

    private IMove[] sortCars(Vehicle[] array){
        IMove[] temp = new IMove[array.length];
        int tempCount = 0;
        int searchYear = 5;
        for (int i = 0; i<array.length; i++){
            if(array[i] instanceof IMove
                    && ((LocalDate.now().getYear()-array[i].getYearOfIssue())<=searchYear)){
                temp[tempCount++] = (IMove)array[i];
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

    private ISwim[] getShips(Vehicle[] array){
        ISwim[] temp = new ISwim[array.length];
        int tempCount = 0;
        int searchYear = 5;
        for (int i = 0; i<array.length; i++){
            if(array[i] instanceof ISwim
                    && ((LocalDate.now().getYear()-array[i].getYearOfIssue())<=searchYear)){
                temp[tempCount++] = (ISwim)array[i];
            }
        }
        System.arraycopy(temp,0,temp,0,tempCount);
        return sortByDescending(temp);
    }

    private ISwim[] sortByDescending(ISwim[] array){
        ISwim[] temp = new ISwim[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = temp.length-1; i>1; i--){
            for(int j = 0; j<i; j++){
                Vehicle first = (Vehicle)temp[j];
                Vehicle second = (Vehicle)temp[j+1];
                if(first instanceof Vehicle && second instanceof Vehicle &&
                        first.getPrice()<second.getPrice()){
                    swap(j, j+1, temp);
                }
            }
        }
        return temp;
    }

    private <T> void swap(int one, int two, T[] array){
        T temp = array[one];
        array[one] = array[two];
        array[two] = temp;
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
        return canFly;
    }

    public void setCanFly() {
        canFly = getFly(array);
    }

    public IMove[] getCanMove(){
        return canMove;
    }

    public void setCanMove(){
        canMove = getMove(array);
    }

    public ISwim[] getCanSwim(){
        return canSwim;
    }

    public void setCanSwim(){
        canSwim = getSwim(array);
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
        displayArray(ascendingSort(array));
    }

    public void descendingSortBySpeed(ICan[] array){
        displayArray(descendingSort(array));
    }

    private ICan[] ascendingSort(ICan[] array){
        ICan[] temp = new ICan[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = temp.length-1; i>1; i--){
            for(int j = 0; j<i; j++){
                Vehicle first = (Vehicle)temp[j];
                Vehicle second = (Vehicle)temp[j+1];
                if(first instanceof Vehicle && second instanceof Vehicle &&
                        first.getSpeed()>second.getSpeed()){
                    swap(j, j+1, temp);
                }
            }
        }
        return temp;
    }

    private ICan[] descendingSort(ICan[] array){
        ICan[] temp = new ICan[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = temp.length-1; i>1; i--){
            for(int j = 0; j<i; j++){
                Vehicle first = (Vehicle)temp[j];
                Vehicle second = (Vehicle)temp[j+1];
                if(first instanceof Vehicle && second instanceof Vehicle &&
                        first.getSpeed()<second.getSpeed()){
                    swap(j, j+1, temp);
                }
            }
        }
        return temp;
    }

}