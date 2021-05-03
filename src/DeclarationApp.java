public class DeclarationApp {
    public static void main(String[] args) {
     float[] nbr = new float[3];
     nbr[0]= 4.6f;
     nbr[1]= 3.4f;
     nbr[2]= 8.9f;

     String[] produits = new String[3];
     produits[0]="pomme";
     produits[1]="poire";
     produits[2]="fraise";



         for( int i = 0;i< produits.length; i++) {
             System.out.println(produits[i]);
             System.out.println(nbr[i]);

         }



    }
}
