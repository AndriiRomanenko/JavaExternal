package lesson.four.task.one;

import lesson.two.Geometry;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by adrie on 22.03.2018.
 */
public class Serializator implements Serializable {
    private Field[] fields;
    public void serialization(Geometry figure, String fileName){
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(figure);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Geometry deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName);
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream is = new ObjectInputStream(fis)) {
            Geometry figure = (Geometry) is.readObject();
            fields = figure.getClass().getDeclaredFields();
            return figure;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("object is not restored");
    }

    public void getFields() {
        for(Field f: fields){
            if(f.getName().equals("serialVersionUID")) continue;
            System.out.println(f);
        }
    }
}
