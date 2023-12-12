public class ej4 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int fila = 0; fila < array.length; fila++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (fila % 2 == 0)
                    array[fila][columnas] = 1;
            }
        }
        for (int fila = 0; fila < array.length; fila++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                System.out.print(array[fila][columnas] + " ");
            }
            System.out.println();
        }
    }
}




