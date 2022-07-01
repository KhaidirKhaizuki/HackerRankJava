import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class File {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner sc = new Scanner(System.in);
               int c =1;
               System.out.println("Enter a string."); 
               while(sc.hasNext()){
               String s = sc.nextLine();
               System.out.println(c+"."+s);
               c++;
               System.out.println("Enter a string."); 
            }
        }
   }

