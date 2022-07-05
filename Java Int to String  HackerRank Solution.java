import java.util.*;
import java.security.*;

class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {

	  private static final long serialVersionUID = 1;
	 }

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}


 
public class solution6 {
	public static void main(String[] args) {
		DoNotTerminate.forbidExit();

		  try {
		   Scanner in = new Scanner(System.in);
		   System.out.println("Enter a number:");
		   int n = in .nextInt();
		   in.close();
		   //String s=???; Complete this line below
		   String s = "" ;  
		   //Write your code here
		   if(n>=-100 && n<=100)
		   {
		        s = Integer.toString(n);//The java.lang.Integer.toString(int a) is an inbuilt method in Java which is used to return a String object, representing the specified integer in the parameter.
		   }
		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } 
		   else {
		    System.out.println("Wrong answer.");
		   }
		  } 
		  catch (DoNotTerminate.ExitTrappedException e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
		 }
       }
	
	

