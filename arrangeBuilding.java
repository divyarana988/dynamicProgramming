import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    long n = scn.nextInt();
    
    long c0 = 1, c1 =1;
    
    for(int i=2; i<=n; i++){
        
        long t0 = c1;
        long t1 = c1 + c0;
        
        
        c0 = t0;
        c1 = t1;
    }
    
    long z = c1+c0;
    z = z*z;
    System.out.println(z);
 }


}