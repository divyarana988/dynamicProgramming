import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    System.out.println(fibT(n));
 }
 
 public static int fibT (int n){
     int q[] = new int[n+1];
     
     for(int i=0; i<=n; i++){
         
         if(i==0){
             q[i] = 0;
         }
         else if(i==1){
             q[i] = 1;
         }else{
             q[i] = q[i-1] + q[i-2];
         }
     }
     
     return q[n];
 }

}