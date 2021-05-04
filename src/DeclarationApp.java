import java.util.Scanner;

public class DeclarationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre");
        int nbr = scanner.nextInt();
        System.out.println("Vous avez entré le nombre "+ nbr);
        if(nbr == 4){
            System.out.println("***");
            for (int i = 0; i < nbr; i++) {
                System.out.println("***");
            }

            for (int i = 0; i < nbr; i++) {
                for (int i1 = 0; i1 + i < nbr; i1++) {

                }
                System.out.println("*");




            }


        }


    }
}
