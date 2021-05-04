package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main ( String...Args){
        Scanner scanner = new Scanner(System.in) ;


        int nb = 0;
        do{
            System.out.print( "Veuillez saisir un nombre entre 1 et 10: " );
            nb = scanner.nextInt();

        } while (nb < 1 || nb > 10 );

        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * "+ i +" est égal à : "+  nb*i);

        }




    }
}
