package lesson.three;


public class Student extends Abiturient{
    private int idGroup;

    public Student(String fio, int idGroup){
        super(fio);
        this.idGroup = idGroup;
    }

    public Student(int idGroup) {
        this.idGroup = idGroup;
    }


    @Override
    public void eat() {
        System.out.println("I'm eat sausage");
    }

    public void study(){
        System.out.println("I;m study");
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

}
