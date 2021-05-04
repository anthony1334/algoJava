package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main (String...Args){
        Scanner scanner = new Scanner(System.in);

        int monTableau[ ] = new int[4];
        int max = monTableau[0];
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("veuillez entrez un nombre :");
            monTableau[i] =scanner.nextInt();
            if(monTableau[i] > max){
                max = monTableau[i];
            }
        }
        System.out.println("le max est : "+ max);

    }
}
