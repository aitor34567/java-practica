public class bucles18 {
    public static void main(String[] args) {
        int num=1;
        int fi=0;
        int cont=0;
        while (cont<10){

            fi=num+fi;
            num=fi-num;
            cont++;
            System.out.print(fi+" ");
        }
    }
}
