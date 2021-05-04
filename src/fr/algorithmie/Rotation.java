package fr.algorithmie;

public class Rotation {
    public static void main ( String...Args){

        int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, 4} ;
        for (int i = array.length -1 ; i > 0 ; i--) {
            array[i] = array[i-1];
        }

    }
}
