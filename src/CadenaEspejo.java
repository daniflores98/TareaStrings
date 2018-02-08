import java.util.Scanner;

public class CadenaEspejo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduzca una cadena de letras ");
		String cadena = sc.nextLine();
		
		StringBuilder aux = new StringBuilder(cadena);
		aux.reverse();
		String cadena2 = aux.toString();
		
		String cadena3 = cadena2.substring(1,cadena2.length());
		
		String cadena_final = cadena + cadena3;
		
		System.out.println(cadena_final);
	}

}
