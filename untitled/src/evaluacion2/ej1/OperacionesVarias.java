package evaluacion2.ej1;

import java.util.Scanner;

public class OperacionesVarias {
    public static int primo (int x){
        int cont=x;
        int cont1=0;
        while (cont>1){
            if (x%cont==0){
                cont1++;

            }
            cont--;
        }

        return cont1;
    }
    public static void piramide (int filas){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        filas=scanner.nextInt();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = filas - 1; i >= 1; i--) {

            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
