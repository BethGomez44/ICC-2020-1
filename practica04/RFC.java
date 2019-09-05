import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
			//Declaracion de variables para el nombre y la fecha
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String();
		String fecha = new String();
			//Solicitar al usuario su nombre completo
		System.out.println("Introduce tu nombre completo:");
		nombreCompleto = scanner.nextLine();
			//Solicitar al usuario su fecha de nacimiento en formato dd/mm/aaaa
		System.out.println("Dame tu fecha de nacimiento en formato dd/mm/aaaa:");
		fecha = scanner.nextLine();
			//Extraer las dos primeras letras del apellido paterno
		int aPaterno = nombreCompleto.indexOf(" ");
		String o = nombreCompleto.substring(aPaterno,aPaterno+3);
		String oMayuscula = o.toUpperCase();
			//Extraer la inicial del apellido materno
		int aMaterno = nombreCompleto.lastIndexOf(" ");
		char p = nombreCompleto.charAt(aMaterno+1);
			//Extraer la inicial del nombre
		char nombre = nombreCompleto.charAt(0);
			//Extraer los últimos dos dı́gitos del año, los dos dı́gitos del mes, y los dos dı́gitos del dı́a.
		String dia = fecha.substring(0,2);
		String mes = fecha.substring(3,5);
		String año = fecha.substring(8,10);
			//Concatenar los datos extraı́dos anteriormente en ese orden.
		System.out.println("El RFC de "+nombreCompleto+" es:" + oMayuscula + p + nombre + año + mes + dia);



	}

}
