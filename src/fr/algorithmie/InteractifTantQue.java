package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main ( String...Args){
        Scanner scanner = new Scanner(System.in) ;


        int nb = 0;
        do{
            System.out.print( "Veuillez saisir un nombre entre 1 et 10: " );
             nb = scanner.nextInt();

        } while (nb < 1 || nb > 10 );

        System.out.println("vous avez choisi " + nb);




    }
}
