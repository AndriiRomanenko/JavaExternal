package lesson.three;


public abstract class Human {
    private String fio;
    public Human(){
        this("Anonim");
    }
    public Human(String fio){
        this.fio = fio;
    }

    abstract void display();
    public void eat(){
        System.out.println("I'm eat");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
