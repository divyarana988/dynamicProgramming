import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int coins[] = new int[n];
        
        for(int i=0; i<n ;i++){
            coins[i] = scn.nextInt();
        }
        
        int amt = scn.nextInt();
        
        System.out.println(cal(coins, amt));
        
    }
    
    public static int cal(int coins[], int amt){
        
        int dp[] = new int[amt+1];
        
        for(int i=0; i<=amt;i++){
        
            if(i==0){
                dp[0] = 1;
            }   
            else{
                for(int coin: coins){
                    if(i>=coin){
                        dp[i] += dp[i-coin];
                    }
                }
            }
            
            
        }
        
        return dp[amt];
        
    }
}