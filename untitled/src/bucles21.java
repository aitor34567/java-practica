import java.util.Scanner;

public class bucles21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=1;
        int media=0;
        int cont=-1;
        System.out.println("Introduzca numeros");

        while (num!=0){
            num = scanner.nextInt();
            if (num<0){
                System.out.println("Numeros positivos");
                num = scanner.nextInt();
            }
            media=media +num;
            cont++;

        }
        System.out.println(media/cont);
    }
}