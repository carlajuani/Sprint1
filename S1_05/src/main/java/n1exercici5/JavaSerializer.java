package n1exercici5;
/* Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar. */

public class JavaSerializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}
	
	
	
	private static <T> T deser(String pathname, Class<T> clazz) throws IOException, ClassNotFoundException {
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
