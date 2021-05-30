import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    
    int tar = scn.nextInt();
    
    System.out.println(target(arr, tar));
    
    
    }
    
    
    public static boolean target(int arr[], int tar){
        
        int n = arr.length;
        
        boolean dp[][] = new boolean[n+1][tar+1];
        
        for(int r=0; r<=n; r++ ){
            for(int c=0; c<=tar; c++){
                
                if(r==0 && c==0){
                    dp[r][c] = true;
                }
                
                else if(c==0){
                    dp[r][c] =  true;
                }
                
                else if(r==0){
                    dp[r][c] =  false;
                }
                else{
                    int coin = arr[r-1];
                    boolean exc = dp[r-1][c];
                    boolean inc = (c-coin>=0) ? dp[r-1][c-coin] : false;
                    dp[r][c] = exc || inc;
                }
                
            }
        }
        return dp[n][tar];
        
    }
}