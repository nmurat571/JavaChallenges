/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogjmp;

/**
 *
 * @author natalia
 */
public class FrogJmp {

    /**
     * @param args the command line arguments
     */
    public int solution(int X, int Y, int D){
        
        int dist = Y-X;
        int jumps = (int)Math.ceil(dist/(double)D);
        return jumps;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        FrogJmp fj = new FrogJmp();
        int hops = fj.solution(10,85,30);
        System.out.println(hops);
    }
    
}
