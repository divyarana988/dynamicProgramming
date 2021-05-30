import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int arr[][] = new int[nr][nc];
        
        for(int i=0; i<nr; i++){
            for(int j=0; j<nc; j++){
                
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(path(arr));
    }
    
    public static int path(int arr[][]){
        
        int nr = arr.length;
        int nc = arr[0].length;
        
        int dp[][] = new int[nr][nc];
        
        for(int c= nc-1; c>=0; c--){
            for(int r = nr-1; r>=0; r--){
                
                if(c== nc-1){
                    dp[r][c] = arr[r][c];
                }
                
                else{
                    if(r==0){
                        dp[r][c] = arr[r][c] +Math.max (dp[r][c+1], dp[r+1][c+1]);
                    }
                    else if(r==nr-1){
                        dp[r][c] = arr[r][c] + Math.max(dp[r-1][c+1], dp[r][c+1]);
                    }
                    else{
                        dp[r][c] =  arr[r][c] + Math.max(dp[r+1][c+1] , Math.max(dp[r                                        -1][c+1], dp[r][c+1]));
                    }
                }
            }
        }
        
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nr; i++){
            max = Math.max(dp[i][0], max);
        }
        
        return max;
    }

}