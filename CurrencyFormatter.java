import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String formattedPayment="";
        // Write your code here.
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        formattedPayment=nf.format(payment);
        System.out.println("US: " + formattedPayment);
        
        nf=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        formattedPayment=nf.format(payment);
        System.out.println("India: " + formattedPayment);
        
        nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
        formattedPayment=nf.format(payment);
        System.out.println("China: " + formattedPayment);
        
        nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        formattedPayment=nf.format(payment);
        System.out.println("France: " + formattedPayment);
    }
}

