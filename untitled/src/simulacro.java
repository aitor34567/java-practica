import java.io.IOException;
import java.util.Scanner;

public class simulacro {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("A. Opción 1");
            System.out.println("B. Opción 2");
            System.out.println("C. Opción 3");
            System.out.println("D. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = (char) System.in.read();
            System.in.read();
            switch (opcion) {
                case 65:
                    int num;
                    int num1 = 0;
                    int suma = 0;
                    System.out.println("dime numeros");
                    do {
                        int cont = 0;

                        num = scanner.nextInt();
                        num1 = num;

                        if (num != 1 && num != -1) {
                            while (cont != 2 && num1 > 1) {
                                if (num % num1 == 0) {
                                    cont++;
                                }
                                num1--;
                            }
                            if (cont < 2) {
                                System.out.println("es primo");
                                suma = suma + num;
                            } else {
                                System.out.println("no es primo");
                            }
                        }
                    } while (num != 1 && num != -1);
                    System.out.println("La suma de los numeros primos es " + suma);

                    break;
                case 66:
                    char texto = 0;
                    System.out.println("introduce un texto");
                    do {

                        texto = (char) System.in.read();
                        char mayus = texto;
                        if (texto >= 97 && texto <= 122) {
                            mayus = (char) (mayus - 32);

                            System.out.print(mayus);
                        } else if (texto >= 65 && texto <= 90 || texto == 32) {
                            System.out.print(mayus);
                        }
                    } while (texto != 10);
                    System.out.println();
                    break;
                case 67:


                    break;
                case 68:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 68);

        scanner.close();
    }
}




















/*
        int num [][]=new int[10][7];
        int media[]=new int[10];
        Random  random=new Random();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = random.nextInt(5,200);
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
        for (int i = 0; i < num.length; i++) {
                media=media+num[i][0];
        }

         */