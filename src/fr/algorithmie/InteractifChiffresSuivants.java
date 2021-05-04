package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main ( String...Args){
        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        System.out.print( "Veuillez saisir un nombre : " );
        nb = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + i);

        }

    }
}
