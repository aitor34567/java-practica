import java.io.IOException;
import java.util.Scanner;

public class bucles23 {
    public static void main(String[] args) throws IOException {
        char frase;
        int palabra = 0;
        int letra=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una frase");
        do {
            frase = (char) System.in.read();
            if (frase==' '){
                palabra++;
            }
            if (frase=='.'){
                palabra++;
            }

            if (frase != '.' && frase != ' ') {
                letra++;
            }
        } while (frase != '.');
        System.out.println(palabra + " palabras");
        System.out.println(letra + " letras");

    }
}

