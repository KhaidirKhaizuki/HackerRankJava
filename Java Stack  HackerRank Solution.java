import java.util.*;
import java.io.*;
import java.util.*;




public class solution11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        while(sc.hasNext()) {
        	
            String input = sc.next();
            System.out.println(balanaced(input)); //string ni akan pindah ke parameter kat balanaced
        }
        }
	
	public static boolean balanaced(String s) { //string dah masuk sini, dia masuk loop lak tuk kira saiz
	    Stack<Character> stack = new Stack<Character>(); //Arraylist object
	    //elements can be added and removed from an ArrayList whenever you want.
	    for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);//char c adalah string dekat index 0 dulu daripada string yg dah pindah
	        if(c =='[' || c == '(' || c == '{') {//kalau c adalah [ or ( or { dia akan push dalam stack kalau selain tu salah
	            stack.push(c);  //push tolak masuk stack ,pop keluar dari stack
	        }else if(c == ']') { //kalau input yg masuk adalah ]
	            if(stack.isEmpty() || stack.pop() != '[') { //kalau dalam stack adalah empty atau dia tak push keluar [ so display false
	                return false;
	            }
	        }else if(c == ')') {
	            if(stack.isEmpty() || stack.pop() != '(') {
	                return false;
	            }
	        }else if(c == '}') {
	            if(stack.isEmpty() || stack.pop() != '{') {
	                return false;
	            }
	        }
	    }
	    return stack.isEmpty();
	}
	}

