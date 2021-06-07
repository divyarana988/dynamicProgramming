import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int price[] = new int[n];
        
        for(int i=0; i<n; i++){
            price[i] = scn.nextInt();
        }
        
        System.out.println(cal(price));
        
    }
    
    public static int cal(int price[]){
        
        int op = 0, bp = 0, cp=0;
        
        for(int i =1; i<price.length; i++){
            
            if(price[i]<price[bp]){
                bp = i;
            }
            
            cp = price[i] - price[bp];
            
            if(cp> op){
                op = cp;
            }
        }
        return op;
        
    }

}