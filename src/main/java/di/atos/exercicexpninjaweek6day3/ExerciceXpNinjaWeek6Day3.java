/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpninjaweek6day3;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpNinjaWeek6Day3 {

    public static void main(String[] args) {
        // Exercice 2
        int[][] tab = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for(int i = 0; i<tab.length; i++) {
            for(int j = 0; j<tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
        }
    }
    
    // Exercice 1
    public int warOfNumber(int[] tab) {
        int sumOfNbrePair = 0, sumOfNbreImpair = 0;
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                sumOfNbrePair+=tab[i];
            }else {
                sumOfNbreImpair+=tab[i];
            }
        }
        
        int sumNbreDiff = (sumOfNbreImpair < sumOfNbrePair) ? sumOfNbrePair - sumOfNbreImpair : sumOfNbreImpair - sumOfNbrePair;
        
        return sumNbreDiff;
    }
    
}
