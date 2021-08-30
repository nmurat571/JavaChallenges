/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoccurrences;

/**
 *
 * @author natalia
 */
public class OddOccurrences {

    public int solution(int[] A) {

        int[] check = new int[A.length];
        boolean checked;
        int c;
        int odd = 0;

        for (int i = 0; i < A.length; i++) {

            c = 0;
            checked = false;
            
            for (int k = 0; k < check.length; k++) {
                if (A[i] == check[k]) {
                    checked = true;
                    break;
                }else if(check[k]==0){
                    break;
                }
            }

            if (!checked) {
                for (int ctrl : A) {
                    if (A[i] == ctrl) {
                        c++;
                    }
                }

                if (c % 2 == 0) { //even element
                    check[i] = A[i];
                } else { //odd element
                    odd = A[i];
                }
            } 

        }

        return odd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] A = {2,500,400,500,400,2,307};
        OddOccurrences oc = new OddOccurrences();
        int o = oc.solution(A);
        System.out.println("Unpaired: " + o);
    }

}
