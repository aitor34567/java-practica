package evaluacion1;

import java.io.IOException;
import java.util.Scanner;

public class simulacre2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Opción A");
            System.out.println("Opción B");
            System.out.println("Opción C");
            System.out.println("Opción D");
            System.out.println("Seleccione una opción:");
            opcion = (char) System.in.read();
            System.in.read();
            switch (opcion) {
                case 65:
                    int num = 0;
                    int num1;
                    System.out.println("Dime un numero");
                    do {
                        int cont = 0;
                        num = scanner.nextInt();
                        num1 = num;

                        if (num != 1) {
                            while (cont != 2 && num1 > 1) {
                                if (num % num1 == 0) {
                                    cont++;

                                }
                                num1--;
                            }
                            if (cont < 2)
                                System.out.println("primo");
                            else if (cont==2){
                                System.out.println("no primo");
                            }
                        }

                    } while (num != 1);

                    break;

                case 66:

                    break;

                case 67:

                    break;

                case 68:

                    break;
                default:
                    System.out.println("marque opción correcta");
                    break;

            }
        } while (opcion != 68);
        scanner.close();
    }
}
