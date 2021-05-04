package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String... Args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3

      /*  for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i] + " est superieur à 3 ");
            }

            //Combiner une boucle et un test de manière à n’afficher que les entiers pairs

            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i1] % 2 == 0) {
                    System.out.println(array[i1] + " est pair");
                }

            }

           // Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant
           // aux index pairs
        for (int i = 0; i < array.length; i++) {
            if( i % 2 == 0){
                System.out.println(array[i]);
        }
        */


           // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for (int i = 0; i < array.length; i++) {
            if( i % 2 != 0){
                System.out.println(array[i]);
            }

        }
    }
}
