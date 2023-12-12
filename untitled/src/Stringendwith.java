import java.util.Scanner;

public class Stringendwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String frase = new String("This battle is quite hard to come by");
		boolean en = frase.endsWith("en");
		boolean by = frase.endsWith("by");
		
		System.out.println(en);
		System.out.println(by);
		
		
		
		 System.out.println("Escriba algo que termine en s, n, a, e, o");
		Scanner sc = new Scanner(System.in);
		String respuesta = sc.nextLine();
		boolean s = respuesta.endsWith("s");
		boolean n = respuesta.endsWith("n");
		boolean a = respuesta.endsWith("a");
		boolean e = respuesta.endsWith("e");
		boolean o = respuesta.endsWith("o");
		if (s) {
			System.out.println("Termina en s");
		} else if (n) {
			System.out.println("Termina en n");
		}else if (a) {
			System.out.println("Termina en a");
		}else if (e) {
			System.out.println("Termina en e");
		}else if (o) {
			System.out.println("Termina en o");
		} else {
			System.out.println("No programa para ti :(");
		}
		
		System.out.println("Juego de poner el primeras 2 letras en la última palabra, es necesario 2 jugadores");
		Scanner scanner = new Scanner(System.in);
		String palabra = sc.next();
		String letras_12 = palabra.substring(0,2);
		boolean confirm = true;
		for (;confirm;) {
			System.out.println("Debe terminar con: " + letras_12);
			palabra = sc.next();
			confirm = palabra.endsWith(letras_12);
			letras_12 = palabra.substring(0, 2);
		}
		System.out.println("Hasta aquí, perdiste");
				}
		
		
	}


