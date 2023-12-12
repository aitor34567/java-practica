public class ordenararraays {
    public static void main(String[] args) {
        int num[]= new int[10];
        int aux=0;
        int aux2=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 30);
            System.out.print(num[i] + " ");

        }System.out.println();
        for (int i = 0; i < num.length; i++) {
            aux=i;
            for (int j = i; j < num.length; j++) {
                if (num[j]>num[aux]){
                    aux=j;
                }
            }
            aux2=num[i];
            num[i]=num[aux];
            num[aux]=aux2;
        }
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i]+ " ");
        }

    }
}
