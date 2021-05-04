package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AffichageInverse {
    public static void main(String... args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


        System.out.println("voici le tableau" + array);

        //Afficher l’ensemble des éléments du tableau grâce à une boucle

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + array[i]);
            System.out.println();
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau

        for (int i = array.length-1; i > 0; i--) {
            System.out.println("Element inversé: " + array[i]);

        }
        System.out.println();
       // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println("arrayCopy : " + arrayCopy[i]);
        }


    }
}