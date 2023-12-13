package evaluacion1;

public class ej5 {
    public static void main(String[] args) {
        int diagonal[][] = new int[5][5];
        int contador = 0;
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[0].length; j++) {
                if  (j == i) {
                    diagonal[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[0].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }

    }
}
