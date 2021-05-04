package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main( String...Args){
        //double rand = Math.random();
       double rand =  Math.floor(Math.random() * (100 - 1 + 1)) + 1;
       int nb =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrez un nombre :");
        nb =scanner.nextInt();
        do {

             if (nb < rand){
                System.out.println(" vous êtes en dessous du chiffre");
                System.out.println("veuillez entrez un nombre :");
                nb =scanner.nextInt();

            } else if(nb > rand){
                System.out.println(" vous êtes au dessus du chiffre");
                System.out.println("veuillez entrez un nombre :");
                nb =scanner.nextInt();

            }

        }while (nb != rand);
        System.out.println("vous avez gagné");


        // Output is different everytime this code is executed
       // System.out.println("Random Number:" + rand);
    }
}
