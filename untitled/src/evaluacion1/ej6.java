package evaluacion1;

public class ej6 {
    public static void main(String[] args) {
        int datos[][] = new int[10][5];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                datos[i][j] = i;
                datos[i][j] = j;
            }

        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
