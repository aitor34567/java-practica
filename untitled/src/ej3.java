public class ej3 {
    public static void main(String[] args) {
        int numeros[] = new int [15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*25);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
