import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(ways(n));
     }
     
     public static int ways(int n){
         int q[] = new int[n+1];
         
         for(int i=0; i<=n; i++){
             if(i==0){
                 q[0] = 1;
             }
             else if(i==1){
                 q[i] = 1;
             }
             else if(i==2){
                 q[i] = q[i-1] + q[i-2];
             }
             else{
                 q[i] = q[i-1] + q[i-2] + q[i-3];
             }
         }
         
         return q[n];
     }

}