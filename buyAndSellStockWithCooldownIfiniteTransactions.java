import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        
        for(int i=0; i<n;i++){
            price[i] = scn.nextInt();
        }
        
        System.out.println(cal(price));
    }
    
    public static int cal(int price[]){
        
        int oBSP =0; int oSSP=0; int oCSP=0;
        
        
        for(int day=0; day<price.length; day++){
            
            if(day==0){
                oBSP = -price[0];
            }
                else{
                int nBSP = Math.max(oBSP, oCSP-price[day]) ;
                int nSSP = Math.max(oSSP, oBSP+price[day]);
                int nCSP = oSSP ;
                
                oBSP = nBSP;
                oCSP = nCSP;
                oSSP = nSSP;
            }
            
        }
        return oSSP;
    }

}