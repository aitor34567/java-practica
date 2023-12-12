public class ej7 {
    public static void main(String[] args) {//Para cuando sepamos cuantos hay pero no cuales son
        int numeros[] = new int[30]; // int numeros[] = {1,2,3,4}  Para cuando sepamos los valores
        int pos = 0;
        int neg = 0;
        int nul = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 61 - 30);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>0){
                pos++;
            }
            if (numeros[i]==0){
                nul++;
            }if (numeros[i]<0){
                neg++;
            }
        }
        System.out.println();
        System.out.println("El numero de positivos es:"+ pos);
        System.out.println("El numero de negativos es:"+ neg);
        System.out.println("El numero de nulos es:"+ nul);

    }
}
