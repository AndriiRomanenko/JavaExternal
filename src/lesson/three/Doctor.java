package lesson.three;


public class Doctor extends Human{
    private int idLicense;

    @Override
    void display() {

    }

    public void cure(){
        System.out.println("I'm cure");
    }

    public int getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(int idLicense) {
        this.idLicense = idLicense;
    }
}
