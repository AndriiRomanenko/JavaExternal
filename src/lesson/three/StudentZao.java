package lesson.three;

/**
 * Created by adrie on 15.03.2018.
 */
public class StudentZao extends Student {
    public StudentZao(int idGroup) {
        super(idGroup);
    }

    public StudentZao(String fio, int idGroup) {
        super(fio, idGroup);
    }
    public StudentZao(){
        super("Petya", 13);
    }
}
