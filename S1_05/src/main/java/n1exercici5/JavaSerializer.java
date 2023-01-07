package n1exercici5;
/* Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar. */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JavaSerializer {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		Person person1 = new Person ("Margarita", "delsHorts", 66);
		serializeJavaObject (person1);
		deserializeJavaObject("javaObject.ser");
	}
	
	public static <T> void serializeJavaObject (T javaObject) {
		try {
			ObjectOutputStream exit = new ObjectOutputStream ( new FileOutputStream("javaObject.ser"));
			exit.writeObject(javaObject);
			exit.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static <T> T deserializeJavaObject(String pathname) throws IOException, ClassNotFoundException {
        File f = new File(pathname);
        if(!f.exists()){
            throw new FileNotFoundException("Cannot find " + pathname);
        }
        Object o = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(f));
            o = in.readObject();
        } finally {
            in.close();
        }
        return (T)o;
    }

}
