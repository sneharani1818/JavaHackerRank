import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int r=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            r=r+a+b;
            for(int j=1;j<=n;j++)
            {
                System.out.print(r+" ");
                r=r+(int)Math.pow(2,j)*b;
                //System.out.print(a+((int)(Math.pow(2,j)*b))+" ");
            }
            System.out.println();
            r=0;
        }
        in.close();
    }
}

