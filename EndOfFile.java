import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s="";
        int l=0;
        while(sc.hasNext())
        {
            s=s+sc.nextLine();
            l++;
            System.out.println(l+" "+s);
            // l++;
            s="";
        }
    }
}

