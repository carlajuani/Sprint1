package n1exercici5;
/* Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar. */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import n1exercici5.Person;

public class JavaSerializer {

	public static void main(String[] args) {
		/*we create a person object, and call the method serialize with the object and its path with the console's first argument, and the
		 * method deserialize with said path from the first argument of the console to print said object*/
		Person person1 = new Person ("Margarita", "delsHorts", 66);
		serializeJavaObject (person1, args[0]);
		System.out.println(deserializeJavaObject(args[0]));
	}
	
	/*with he generic object and its string filePath as arguments, we create a file outputStream with the path we want to create, with 
	 * an object outputStream. We call the method write object with said object to write it on the ser file, and then close the stream, all
	 * wrapped with a try catch to prevent the 2 exceptions that can usually arise in the method*/
	public static <T> void serializeJavaObject (T javaObject, String pathName) {
		try {
			ObjectOutputStream objectToFile = new ObjectOutputStream ( new FileOutputStream(pathName));
			objectToFile.writeObject(javaObject);
			objectToFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*with the file pathname to deserialize, wrapped in a try catch for the 3 exceptions most common, we declare a file, an object and an object 
	 * inputStream outside the try to be able to return the object as a local variable of the method. Then we try to create a new file with the
	 * arguments path, a file inputStream with said path in an object InputStream, the object to deserialize with the method readObject from the 
	 * object inputStream, and closing the stream, we return the generic object to print in the main method*/
	private static <T> T deserializeJavaObject(String pathname) {
        File file = null;
        Object obj = null;
        ObjectInputStream inStream = null;
        try {
        	file = new File(pathname);
        	inStream = new ObjectInputStream(new FileInputStream(file));
            obj = inStream.readObject();
            inStream.close();
        } catch (FileNotFoundException e){
        	System.out.println("Cannot find " + pathname);
        } catch (ClassNotFoundException e){
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } 
        return (T)obj;
    }

}
