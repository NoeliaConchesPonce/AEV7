package es.florida.ejercicio1;

import java.io.File;

public class prueba {

	public static void main(String[] args) {

	}
	public static void CrearCarpeta() {
		File Carpeta = new File("Carpeta1/Carpeta").mkdir();
		try {
			Carpeta.mkdir();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
