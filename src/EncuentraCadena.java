import java.util.Scanner;
import java.util.StringTokenizer;

public class EncuentraCadena {

	public static void main(String[] args) {
		
		int contador = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Introduzca una primera cadena de letras ");
		String cadena = sc.nextLine();
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		cadena = str.nextToken();
		
		System.out.println(" Introduzca una segunda cadena de letras ");
		String cadena2 = sc.nextLine();
		StringTokenizer str1;
		str1 = new StringTokenizer(cadena2);
		cadena2 = str1.nextToken();
		
		do {
			if (cadena == cadena2);
			contador++;
			System.out.println(" La palabra " +cadena2+ " se repite " +contador+ " veces ");
			break;
		}while (str.hasMoreTokens());
		
		}
	}



