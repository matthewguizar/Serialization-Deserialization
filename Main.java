import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Car car = new Car("My car", "Gray");

        //Serialization Process
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt"); //adding car to abc.txt file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(car);

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("abc.txt"); //reading car that was added from previous step
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car car1 = (Car)objectInputStream.readObject();
        System.out.println(car1.getColor());
        System.out.println(car1.getName());
    }
}