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
        
        for(int i=n; i>=0; i--){
            
            if(i==n){
                q[n] = 1;
            }
            else{
                int max = moves[i];
                if(max==0){
                    q[i] = 0;
                }
                else{
                    for(int jmp=1; jmp<=max && jmp+i<=n; jmp++){
                        q[i]+=q[i+jmp];
                    }
                }
            }
        }
        return q[0];
    }

}