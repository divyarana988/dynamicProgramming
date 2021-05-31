import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int cofA = 0, cofAB = 0, cofABC=0;
        
        for(int i=0; i<str.length();i++){
            
            char ch = str.charAt(i);
            if(ch=='a'){
                cofA = (2*cofA) + 1;
            }
            else if(ch=='b'){
                cofAB = (2*cofAB) + cofA;
            }
            else if(ch=='c'){
                cofABC = (2*cofABC) + cofAB;
            }
            
        }
        System.out.println(cofABC);
    }
}