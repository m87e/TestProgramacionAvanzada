import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class UsoPropeties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileReader("config.properties"));
		System.out.println(pro.getProperty("parametro1"));
		System.out.println(pro.getProperty("configuracion"));
		System.out.println(pro.getProperty("identificador"));
		
		pro.setProperty("parametro1", "valor_dos");
		pro.store(new FileWriter("config2.properties"), "Comentario agregado");
		pro.load(new FileReader("config2.properties"));
		
		
		//Recorre todo el file
		Enumeration<Object> enumeration = pro.keys();
		while (enumeration.hasMoreElements()) {
			System.out.println(pro.getProperty(String.valueOf(enumeration.nextElement())));
		}
		
	}

}
