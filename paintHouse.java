import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int mat[][] = new int[n][3];
        
        for(int i=0; i<n; i++){
            
            mat[i][0] = scn.nextInt();
             mat[i][1] = scn.nextInt();
              mat[i][2] = scn.nextInt();
        }
        
        int cred= 0, cblue=0, cgreen=0;
        
        for(int i=0;i<n;i++){
            
            if(i==0){
                cred = mat[0][0];
                cblue = mat[0][1];
                cgreen = mat[0][2];
                
            }else{
                int red = Math.min(cblue,cgreen) + mat[i][0];
                int blue = Math.min(cred,cgreen) + mat[i][1];
                int green = Math.min(cblue,cred) + mat[i][2];
                
                cred = red;
            cblue = blue;
            cgreen = green;
            }
            
            
        }
        
        int cost = Math.min(cred, Math.min(cgreen, cblue));
    System.out.println(cost);
    }
    
    
    
    
    
}