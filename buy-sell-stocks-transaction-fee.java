import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int price[] = new int[n];
        
        for(int i=0; i<n; i++){
            price[i] = scn.nextInt();
        }
        
        int tfee = scn.nextInt();
        
        System.out.println(cal(price, tfee));
    }
    
    public static int cal(int[]price, int tfee){
        int obsp = 0; int ossp = 0;
        
        for(int i=0; i<price.length; i++){
            if(i==0){
                obsp = -price[0];
            }
            else{
                int nbsp = Math.max(ossp - price[i], obsp);
                int nssp = Math.max(ossp, price[i]-tfee+obsp);
                
                obsp = nbsp;
                ossp = nssp;
            }
        }
        return ossp;
    }

}



