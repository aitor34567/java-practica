import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        int num=0;
        int columna=0;
        int filas=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca número de filas: ");
        int numFilas = scanner.nextInt();
        while (filas<numFilas){
            columna=0;
            num++;
            while (columna<=filas){
                num++;
                System.out.print(num);
                columna++;
                num--;

            }
            System.out.println();
            filas++;
        }

    }
}























/* filas--;
         while (filas>0){
         columna=0;
         num=1;
         while (columna<filas){
        System.out.print(num);
        columna++;
        num++;
        }
        System.out.println();
        filas--;
        }
*/












/*for (int altura = 1; altura <= numFilas; altura++) {
 for (int blancos = 1; blancos <= numFilas - altura; blancos++)
         System.out.print(" ");
        }
        for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
        System.out.print("*");
        }
        System.out.println();

 */
