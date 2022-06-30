import java.io.*;
import java.util.*;

public class Solution2 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t:");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	System.out.println("Enter a:");
        	int a = in.nextInt();
        	System.out.println("Enter b:");
        	int b = in.nextInt();
        	System.out.println("Enter iteration:");
        	int n = in.nextInt();           
            int sum = a;
            for (int j = 0; j<n; j++) {                
                int nextEle = (int)Math.pow(2, j)*b;
                sum = sum + nextEle;
                System.out.printf("%s ",sum);                                
            }
            if (i < t-1) {
                System.out.print("\n");
            }
            
        }
        in.close();       

    }

}






