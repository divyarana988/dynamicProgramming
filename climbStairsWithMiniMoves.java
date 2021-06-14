import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int moves[] = new int[n];
        
        for(int i=0; i<n; i++){
            moves[i] = scn.nextInt();
        }
        
        System.out.println(climb(moves));
    }
    
    public static int climb(int moves[]){
        
        int n = moves.length;
        int q[] = new int[n+1];
        q[n] = 0;
        for(int i=n-1; i>=0; i--){
            
            int maxJ = moves[i];
            int mini = Integer.MAX_VALUE;
            if(maxJ==0){
                q[i] = Integer.MAX_VALUE ;
            }else{
                for(int j=1; j<=maxJ && i+j<=n; j++){
                    mini = Math.min(mini, q[i+j]);
                }
                if(mini==Integer.MAX_VALUE){
                        q[i] = Integer.MAX_VALUE;
                }else{
                    q[i] = mini + 1;
                }
            }
        }
        return q[0];
    }

}