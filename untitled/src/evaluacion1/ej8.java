package evaluacion1;

public class ej8 {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int mayor = 0;
        int pos=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50);
            System.out.print(numeros[i] + " ");
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >mayor) {
                mayor = numeros[i];
                pos =i ;
            }
        }
        System.out.println();
        System.out.println(mayor);
        System.out.println(pos);


    }
}
