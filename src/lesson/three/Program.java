package lesson.three;


public class Program {
    public static void main(String[] args) {
        Human st1 = new Student("Vasya", 1);
        Human doc1 = new Doctor();
        Human voin1 = new Voin();

        Human[] masObj = new Human[4];
        masObj[0] = st1;
        masObj[1] = doc1;
        masObj[2] = voin1;
        masObj[3] = new StudentZao();
        Student[] masStud = new Student[2];
        int countStud = -1;
        for(int i = 0; i < masObj.length; i++){
            masObj[i].eat();
            masObj[i].display();
            if("prj3.Student".equals(masObj[i].getClass().getName())){

           // }
            //if(masObj[i] instanceof Student){
                ((Student)masObj[i]).eat();
                masStud[++countStud] = (Student)masObj[i];
            }
        }
        for( int i = 0; i<masStud.length; i++){
            System.out.println(masStud[i]);
        }
    }
}
