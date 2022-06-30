import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution4 {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N>1 && N<=20)
        {
        for(int i=1 ; i<=10 ; i++) // i start from 1 and end if equal to 10, for(index start, condition, increment)
          {
           int mul=N*i; //formulae
           System.out.println(N+" x "+i+" = "+mul); //+ is for connecting, a space if you want to merge with parameter or variable
           }
        }
        scanner.close();
    }
	
}
