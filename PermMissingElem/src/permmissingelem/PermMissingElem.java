/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permmissingelem;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author natalia
 */
public class PermMissingElem {

    /**
     * @param args the command line arguments
     */
    public int solution(int[] A) {

        if (A.length == 0 || A == null) {
            return 1;
        } else {
            int sum = IntStream.of(A).sum();
            int n = Arrays.stream(A).max().getAsInt();
            int series = (n * (n + 1)) / 2;
            int missing = series - sum;
            return missing;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        PermMissingElem pme = new PermMissingElem();
        int[] arr = {};
        int missing = pme.solution(arr);
        System.out.println("Missing: " + missing);
    }

}
