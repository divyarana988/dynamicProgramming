import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        
        int cost[][] = new int [nr][nc];
        
        for(int i=0; i<=nr-1; i++){
            for(int j=0; j<=nc-1; j++){
                cost[i][j] = scn.nextInt();
                
            }
        }
        
        System.out.println(mincost(cost));
    }
    
    public static int mincost(int cost[][]){
        
        int nr = cost.length;
        int nc = cost[0].length;
        
        int dp[][] =  new int[nr][nc];
        
        for(int r = nr-1; r>=0 ; r--){
            for(int c = nc-1; c>=0; c--){
                
                if(r== nr-1 && c==nc-1){
                    dp[r][c] = cost[r][c];
                }
                else{
                    if(r==nr-1){
                        dp[r][c] = cost[r][c] + dp[r][c+1];
                    }
                    else if(c==nc-1){
                        dp[r][c] = cost[r][c] + dp[r+1][c];
                    }
                    else{
                        dp[r][c] = cost[r][c] + Math.min(dp[r][c+1], dp[r+1][c]);
                    }
                }
                
            }
            
        }
        
        return dp[0][0];
        
    }

}