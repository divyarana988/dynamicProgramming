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
    
    int inc=0; int exc=0;
    
    for(int i=0; i<n; i++){
        
        if(i==0){
            exc = 0;
            inc = arr[0];
        }else{
            int nexc = Math.max(exc, inc);
            int ninc = exc + arr[i];
            
            inc = ninc;
            exc = nexc;
        }
        
    }
    
    int msum = Math.max(inc, exc);
    System.out.println(msum);
    
    }
}