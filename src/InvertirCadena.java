import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduzca una cadena de letras ");
		String cadena = sc.nextLine();
		
		StringBuilder aux = new StringBuilder(cadena);
		aux.reverse();
		String aux2 = aux.toString();
		
		System.out.println(" La cadena introducida es " +cadena+ " y dada la vuelta es " +aux.toString());

	}
}
