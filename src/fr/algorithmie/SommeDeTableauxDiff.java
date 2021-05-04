package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main( String...Args){
        //•Créer un tableau qui contient la somme des 2 précédents tableaux

       int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
       int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int sommeArray1 = 0;
        int sommeArray2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sommeArray1 = sommeArray1 + array1[i];

        }

        for (int i = 0; i < array2.length; i++) {
            sommeArray2 = sommeArray2 + array2[i];

        }
        int somme = sommeArray1 + sommeArray2;
        int[] array3 = { somme};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

        }


    }
}
