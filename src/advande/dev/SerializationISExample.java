package advande.dev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
public class SerializationISExample {
    public static void main(String args[]) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data/engineer.txt"));
            Engineer engineer = new Engineer("S", "Gp Coder", 1, "a" );
            oos.writeObject(engineer);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }
}
