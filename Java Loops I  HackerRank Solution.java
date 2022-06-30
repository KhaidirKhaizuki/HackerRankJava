import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution4 {
	private static final Scanner scanner = new Scanner(System.in); //private static final will be considered as constant and the constant can be accessed within this class only. Since, the keyword static included, the value will be constant for all the objects of the class. private final variable value will be like constant per object. You can refer the java.
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
