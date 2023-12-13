package evaluacion1;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

        System.out.println("hamburger".substring(3, 8)+"unhappy".substring(2));//Aparecen los caracteres entre las posiciones del paréntesis
        System.out.println("unhappy".substring(2));//Desaparecen los primneros dos caracteres
        System.out.println("emptiness".substring(9));//Desaparecen 9 caracteres
    }
}
