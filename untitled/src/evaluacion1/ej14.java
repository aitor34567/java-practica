package evaluacion1;

public class ej14 {
    public static void main(String[] args) {
        int num[] = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 5);
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < num.length; i++) {
            int cont=0;
            for (int j = 0; j < num.length; j++) {
                int aux = num[i];
                if (aux == num[j])
                    cont++;
            }
            System.out.println();
            System.out.println("Hay " +cont+ " " +num[i]);
        }


    }
}
