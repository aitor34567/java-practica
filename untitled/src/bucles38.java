import java.util.Scanner;

public class bucles38 {
    public static void main(String[] args) {
        int numero = 1;
        int num = 0;
        int cont = 0;
        numero = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        while (num != numero && cont < 5) {
            System.out.println("Introduzca un número");
            num = scanner.nextInt();
            if (num < numero) {
                System.out.println("el numero es mayor");
            }
            if (num > numero) {
                System.out.println("el numero es menor");
            }
            cont++;
        }
        if (num == numero)
            System.out.println("ha ganado");
        if (cont == 5)
            System.out.println("ha perdido, el número es"+numero);


    }
}
