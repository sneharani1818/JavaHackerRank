import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int l=s1.length();
                l=15-l;
                for(int j=1;j<=l;j++)
                    s1=s1+" ";
                if(x<10)
                    s1=s1+"00";
                else if(x<100)
                    s1=s1+"0";
                s1=s1+x;
                System.out.println(s1);
            }
            System.out.println("================================");

    }
}



 

