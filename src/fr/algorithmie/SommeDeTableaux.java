package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
    public static void main(String... Args) {
        //• Créer un tableau qui contient la somme des 2 précédents tableaux

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};


        int[] array4 = new int[array1.length];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = array1[i] + array2[i];
            System.out.println(array4[i]);
        }

   /* int sommeArray1 = 0;
    int sommeArray2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sommeArray1 = sommeArray1 + array1[i] + array2[i];

        }

        for (int i = 0; i < array2.length; i++) {
            sommeArray2 = sommeArray2 + array2[i];

        }

int[] array3 = { sommeArray1, sommeArray2};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

        }*/





    }
}

