import java.util.Scanner;

public class bucles32 {
    public static void main(String[] args) {
        int suma=0;
        int num;
        int cont=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime numeros");
        do {
           num=scanner.nextInt();
           if (num%6==0){
               suma=suma+num;
           }


        }while (suma<30);
        System.out.println("El total es "+suma);
    }
}
