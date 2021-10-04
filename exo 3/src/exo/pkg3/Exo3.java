/*
 * Monnier Ambre et Lemaire Jean; TDA; calculette; 03/10/2021
 */
package exo.pkg4;

import java.util.Scanner;

/**
 *
 * @author jeanl
 */
public class Exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) Mmultiply");
        System.out.println("4) divide");
        System.out.println("5) divide");
        System.out.println("choisissez votre opérarteur");
        operateur = sc.nextInt();
        
        if (operateur < 1 || operateur > 5){
            System.out.println("erreur");
            System.exit(0);
        }
        
        int operande1;
        System.out.println("entrez un nombre");
        operande1 = sc.nextInt();
        
        int operande2;
        System.out.println("entrez un nombre");
        operande2 = sc.nextInt();
        
        int result = 0;
        if (operateur == 1){
            result = operande1 + operande2;
        }
        
        if (operateur == 2){
            result = operande1 - operande2;
        }
        
        if (operateur == 3){
            result = operande1 * operande2;
        }
        
         if (operateur == 4){
            result = operande1 / operande2;
        }
        
          if (operateur == 5){
            result = operande1 % operande2;
        }
          
        System.out.println(result);
    }
    
    
}
