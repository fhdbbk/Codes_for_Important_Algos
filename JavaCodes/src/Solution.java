import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s[]= in.nextLine().split(" ");
        String A = s[0];
        String B = s[1];
        int lenB = s[1].length();
        int lenA = s[0].length();
        int status = 0;
        int count = 0;
        for(int i = 0; i < lenA-lenB + 1; i++)
        {
            status = 0;
            for(int j = 0, k = i; j < lenB ; j++, k++)
            {
                if(status == 0)
                {
                    if(A.charAt(k) != B.charAt(j))
                    {
                        status = status + 1;
                    }
                }
                else
                {
                    if(status == 1)
                    {
                        if(A.charAt(k) != B.charAt(j))
                        {
                            status = status + 1;
                            break;
                        }
                    }
                }
           }
           if(status == 1)
           {
               count++;
           }
        }
        System.out.println(count);
    }
}