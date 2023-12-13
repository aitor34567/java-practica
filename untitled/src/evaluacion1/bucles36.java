package evaluacion1;

import java.util.Scanner;

public class bucles36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int resul=0;
        int num2=1;
        do {
            System.out.println("Dime un número");
            int num=scanner.nextInt();

            if (num%num2==0){
                resul=1;
                num2++;
            }else
                System.out.println("El numero no es primo");
        }while(resul==2);
        System.out.println("El numero es primo");
    }
}
