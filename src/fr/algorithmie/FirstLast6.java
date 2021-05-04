package fr.algorithmie;

public class FirstLast6 {
    public static void main ( String...Args){
        /*  Dans cette classe, on déclare un tableau d’entiers
• On calcule une valeur booléenne qui contrôle le tableau de la sorte :
o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
dernier élément vaut 6.
o elle vaut false dans les autres cas
• écrire l’algo de valorisation de cette variable avec le minimum de lign*/
        boolean myVariable = false ;
        int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4} ;
        if(array.length >= 1 && array[0] == 6 || array[array.length-1] == 6){
            myVariable = true;
        }
        else{
            myVariable = false;
        }
        System.out.println(
                myVariable
        );

    }
}
