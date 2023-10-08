import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int b=0,h=0;
        try{
            b=sc.nextInt();
            h=sc.nextInt();
            if(b<=0||h<=0)
                throw new Exception("Breadth and height must be positive");
        }  
        catch(Exception e)
        {
            System.out.println(e.toString());
            System.exit(0);
        }      
        int area=1;
        area=area*b*h;
        System.out.println(area);
    }
}

