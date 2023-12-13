package evaluacion1;

public class simulacre3 {
    public static void main(String[] args) {
        int num[] = new int[10];
        int aux;
        int aux2=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 20);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            aux = i;
            for (int j = 0; j < num.length; j++) {
                if (num[j] < num[aux]) 
                aux = j;

            aux2=num[i];
            num[i]=num[aux];
            num[aux]=aux2;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
    }
}
