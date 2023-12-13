package evaluacion2.ej1;

import java.util.Scanner;

public class tester1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("Introduzca una opción");
            opcion = lector.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduzca operandos");
                int num1=lector.nextInt();

                int resultado=OperacionesVarias.primo(num1);

                if (resultado==1){
                    System.out.println("es primo");
                }else{
                System.out.println("no es primo");}
                break;
            case 2:

                break;
            case 3:
                System.out.println("adios");
                break;
        }
    }while (opcion!=3);
    }
}
