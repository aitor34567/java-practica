import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco antes de los números
            for (int j = altura - i; j > 0; j--) {
                System.out.print(" ");
            }

            int inicio = i;
            // Números ascendentes
            for (int j = inicio; j <= i * 2 - 1; j++) {
                System.out.print(j % 10);
            }

            // Números descendentes
            for (int j = (i * 2 - 1) - 1; j >= inicio; j--) {
                System.out.print(j % 10);
            }

            System.out.println();
        }
    }
}
