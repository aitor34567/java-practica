package evaluacion1;

public class ej9 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 15 + 1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (i%2==0){
                suma = suma+numeros[i];
                System.out.print(numeros[i]+ " ");
        }

        }


         System.out.println();
        System.out.println("La suma es "+suma);
    }
}
