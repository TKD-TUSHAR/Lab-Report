package lab_1;

import java.util.Scanner;

public class program_3 {

	public static void main(String[] args) {
		
    int n, rev=0, d;
    
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Enter the number:-");
    
    n = kb.nextInt();
    
    while(n>10)
    	
    {
    	d = n%10;
    	rev = rev * 10 + d;
    	n=n/10;
    	
    }
    
    System.out.println("Reverse number is:" +rev);
    
	}

}

