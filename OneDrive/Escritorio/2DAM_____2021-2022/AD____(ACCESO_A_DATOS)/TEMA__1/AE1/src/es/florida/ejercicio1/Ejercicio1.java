package es.florida.ejercicio1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		File(args);
		CrearCarpeta();
		CrearFichero();
		EliminarCarpeta();
		EliminarFichero();
		RenombrarFichero();
		RenombrarCarpeta();
	}

	public static void File(String[] args) {
		File Directorio = new File(args[0]);
		System.out.println("Nombre" + Directorio.getName());
		if(Directorio.isDirectory()) {
			System.out.println("Tipo: Directorio");
			File[] lista = Directorio.listFiles();
			int contador = 0;
			for(int i = 0; i<lista.length; i++) {
				contador++;
			}
			System.out.println("Numero de elementos: " + contador);
			System.out.println("Espacio Total: " + Directorio.getTotalSpace());
			System.out.println("Espacio libre: " + Directorio.getFreeSpace());
			System.out.println("Espacio Total: " + (Directorio.getTotalSpace()-Directorio.getFreeSpace()));

		}else {
			System.out.println("Tipo: Fichero");
			System.out.println("Tamaño en bytes" + Directorio.length());
		}
		
		System.out.println("Ruta absoluta" + Directorio.getAbsolutePath());
		long modificacion = Directorio.lastModified();
		
		
		String formato = "dd-MM-aaaa hh:mm";
		SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
		
		Date fecha = new Date (modificacion);
		System.out.println("Fecha de ultima modificacion: " + formatoFecha.format(fecha));
		System.out.println("Oculto: " + Directorio.isHidden());

		
		
		

		
	}
	
	public static void CrearCarpeta() {
		Scanner leer = new Scanner(System.in);
		String strCarpeta;
		System.out.println("Introduce el nombre de la carpeta: ");
		strCarpeta = leer.nextLine();
		boolean Carpeta = new File("Carpeta1"+strCarpeta).mkdir();
		/*try {
			Carpeta.mkdir();
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}
	
	public static void CrearFichero() {
		Scanner leer = new Scanner(System.in);
		String strFichero;
		System.out.println("Introduce el nombre del fichero: ");
		strFichero = leer.nextLine();
		File Fichero = new File("Carpeta1"+strFichero+".txt");
		try {
			if(Fichero.createNewFile()) {
				System.out.println("Se ha creado correctamente");
			}else {
				System.out.println("No se ha podido crear.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void EliminarCarpeta() {
		Scanner leer = new Scanner(System.in);
		String strCarpeta;
		System.out.println("Introduce el nombre de la carpeta que quieres eliminar: ");
		strCarpeta = leer.nextLine();
		File Carpeta3 = new File("Carpeta1"+strCarpeta);
		try {
			if(Carpeta3.delete()) {
				System.out.println("Se ha eliminado correctamente");
			}else {
				System.out.println("No se ha podido eliminar.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void EliminarFichero() {
		Scanner leer = new Scanner(System.in);
		String strFichero;
		System.out.println("Introduce el nombre del fichero que quieres eliminar: ");
		strFichero = leer.nextLine();
		File Eliminado = new File("Carpeta1"+strFichero+".txt");
		try {
			if(Eliminado.delete()) {
				System.out.println("Se ha eliminado correctamente");
			}else {
				System.out.println("No se ha podido eliminar.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public static void RenombrarFichero() {
		Scanner leer = new Scanner(System.in);
		String strFichero;
		System.out.println("Introduce el nombre del fichero que quieres renombrar: ");
		strFichero = leer.nextLine();
		File renombrar = new File("Carpeta1"+strFichero+".txt");
		Scanner leer2 = new Scanner(System.in);
		String strFicheroNuevo;
		System.out.println("Introduce el nuevo nombre del fichero: ");
		strFicheroNuevo = leer.nextLine();
		File nuevo = new File("Carpeta1"+strFicheroNuevo+".txt");
		
		if(renombrar.renameTo(nuevo)) {
			System.out.println("El fichero ha sido renombrado");
		}else {
			System.out.println("El fichero NO ha sido renombrado");

		}
		
		
	}
	public static void RenombrarCarpeta() {
		Scanner leer = new Scanner(System.in);
		String strCarpeta;
		System.out.println("Introduce el nombre de la carpeta que quieres renombrar: ");
		strCarpeta = leer.nextLine();
		File original = new File("Carpeta1"+strCarpeta);
		Scanner leer2 = new Scanner(System.in);
		String strCarpetaNuevo;
		System.out.println("Introduce el nuevo nombre: ");
		strCarpetaNuevo = leer.nextLine();
		File nuevo = new File("Carpeta1"+strCarpetaNuevo);
		
		if(original.renameTo(nuevo)) {
			System.out.println("La carpeta ha sido renombrada");
		}else {
			System.out.println("La carpeta NO ha sido renombrada");

		}
	}
	
	
	
	
	
}
