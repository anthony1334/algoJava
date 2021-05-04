package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String... args) {
       // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
        //dans l’ordre inverse.

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println();

        for (int i = arrayCopy.length-1; i > 0 ; i--) {

            System.out.println("arrayCopy inversé " + arrayCopy[i]);
        }
       // Afficher l’ensemble des éléments des 2 tableaux


    }
}
