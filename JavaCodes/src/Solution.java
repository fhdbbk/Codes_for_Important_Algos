import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s[]= in.nextLine().split(" ");
        String s1=s[0];
        String s2=s[1];
        int lb=s[1].length();
        int la=s[0].length();
        int status=0;
        int count =0;
        int j,i,k;
        for(i=0;i<la-lb+1;i++){
            status=0;
           for(j=0,k=i;j<lb;j++,k++){
                if(status==0){
                    if(s1.charAt(k) != s2.charAt(j)){
                        status = status + 1;
                    }
                }else{
               
                if(status==1){
                    if(s1.charAt(k) != s2.charAt(j)){
                        status = status + 1;
                        break;
                    }
                }}
           }
            if(status == 1){
                count = count +1;
            }
        }
            if(status == 1){
                count = count +1;
            }
            System.out.println(count);
        }
        
          
        
        
        
        
        
        
    
}