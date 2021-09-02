/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapeequilibrium;

/**
 *
 * @author natalia
 */
public class TapeEquilibrium {

    public int solution(int[] A) {

        int numbersOnRight = 0;

        for (int i = 0; i < A.length; i++) {
            numbersOnRight += A[i];
        }
        
        int minDiff = Integer.MAX_VALUE;

        int numbersOnLeft = 0;
        for (int i = 0; i < A.length; i++) {
            numbersOnRight -= A[i];
            numbersOnLeft += A[i];
            
            if(Math.abs(numbersOnLeft-numbersOnRight)<minDiff){
                minDiff = Math.abs(numbersOnLeft-numbersOnRight);
            }
        }

        return minDiff;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3}));
    }

}
