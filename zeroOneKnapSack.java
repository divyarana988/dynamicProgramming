import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n= scn.nextInt();
        
        int values[] = new int[n];
        
        for(int i=0; i<n; i++){
            values[i] = scn.nextInt();
        }
        
        int wt[] = new int[n];
        
        for(int i=0; i<n; i++){
            wt[i] = scn.nextInt();
        }
        
        int cap = scn.nextInt();
        
        System.out.println(cal(values, wt, cap));
        
    }
    
    public static int cal(int val[], int wt[], int cap){
        
        int nr = val.length+1;
        int nc = cap+1;
        
        int dp[][] = new int [nr][nc];
        
        for(int r=1; r<nr; r++){
            int wts = wt[r-1]; int vals = val[r-1];
            for(int c=1; c<nc; c++){
                
                int exc = dp[r-1][c];
                int inc = (c-wts >= 0) ?(vals + dp[r-1][c-wts]) : 0;
                
                dp[r][c] = Math.max(inc, exc);
            }
        }
        
        return dp[nr-1][nc-1];
    }
}