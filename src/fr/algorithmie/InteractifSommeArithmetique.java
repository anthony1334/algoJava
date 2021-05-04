package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main ( String...Args){
        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        int somme = 0;
        System.out.print( "Veuillez saisir un nombre : " );
        nb = scanner.nextInt();
        for (int i = 0; i <= nb; i++) {

           somme  = somme +i;
        }
        System.out.println(somme);

    }
}
