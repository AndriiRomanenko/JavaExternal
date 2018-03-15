package lesson.three;


public class Voin extends Human{
    private int power;
    public void fight(){
        System.out.println("I'm fight");
    }

    @Override
    void display() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
