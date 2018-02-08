import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'G', 'M', 'Y', 'F' , 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		System.out.println(" Introduce tu DNI: ");
		String dni = sc.nextLine();
		
		String let = dni.substring((dni.length()-1),dni.length());
		let.toUpperCase();
		char letra = let.charAt(0);
		
		String dni_numeros = dni.substring(0, (dni.length()-1));
		int numeros = Integer.parseInt(dni_numeros);
		numeros = numeros % 23;
		
		if (letras[numeros] == letra)
			System.out.println(" El DNI introducido es correcto ");
		else System.out.println(" El DNI introducido es incorrecto ");
		
		}
	}


