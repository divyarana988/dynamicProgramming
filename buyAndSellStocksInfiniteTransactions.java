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
        
        int sp = 0, bp = 0, p=0;
        
        for(int i =1; i<price.length; i++){
            
            if(price[i]>=price[i-1]){
                sp = i;
            }
            else{
                p+=price[sp] - price[bp];
                sp=i;
                bp=i;
            }
        }
        p+=price[sp]-price[bp];
        return p;
        
    }

}