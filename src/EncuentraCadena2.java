import java.util.Scanner;
import java.util.StringTokenizer;

public class EncuentraCadena2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduzca una primera cadena de letras ");
		String cadena = sc.nextLine();
		
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		while(str.hasMoreTokens())
			System.out.println(str.nextToken());
	}

}
