package evaluacion1;

public class ordenar {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int mayor = 0;
        int menor = 15;
        int aux=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 15);
            System.out.print(numeros[i] + " ");

        }System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; numeros[i] < menor; j++) {
                menor=numeros[i];
                for ( j = 0; numeros[i] > mayor; j++) {
                    mayor = numeros[i];
                }
            }


        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println(menor + " "+ mayor);
    }
}
