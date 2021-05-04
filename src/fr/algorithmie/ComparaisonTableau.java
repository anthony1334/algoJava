package fr.algorithmie;

public class ComparaisonTableau {
    public static void main (String...Args) {

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
//Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array2.length; i1++) {
                if(array1[i] == array2[i1]){
                    System.out.println(array1[i]);
                }
            }

        }





    }
}
