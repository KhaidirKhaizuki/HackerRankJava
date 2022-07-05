import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class java_hashset {
	public static void main(String[] args) {
		System.out.println("Enter input:");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();// berapa input string nak masuk
        String [] pair_left = new String[t]; //array of string ade 5 kotak untuk pair kiri
        String [] pair_right = new String[t]; //array of string ade 5 kotak untuk pair kanan
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> pairs = new HashSet<String>(t); //declare stack nama pairs
        for(int i = 0; i < t; i++)
        {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" ); //ni command tuk push atau masukkan value dalam row of stack
            System.out.println(pairs.size());        
        }
	}
	
	
}
