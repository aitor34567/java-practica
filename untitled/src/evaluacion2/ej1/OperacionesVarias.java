package evaluacion2.ej1;

import java.util.Scanner;

public class OperacionesVarias {
    public static int primo (int x){
        int cont=x;
        int cont1=0;
        while (cont>1){
            if (x%cont==0){
                cont1++;

            }
            cont--;
        }

        return cont1;
    }

}
