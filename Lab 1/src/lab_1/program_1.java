package lab_1;



import java.util.Scanner;


public class program_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
    System.out.println("Enter two Numbers");
    
    int a = kb.nextInt();
    int b = kb.nextInt();
    
    int c = a+b;
    
    System.out.println("Sum of " +a+ " and " +b+ " is " +c);
    
    int d = a-b;
    
    System.out.println("Subtraction of " +a+ " and " +b+ " is " +d);
		
    
    float e = a/b;
    
    System.out.println("Div of " +a+ " and " +b+ " is " +e);
		
    
    int f = a*b;
    
    System.out.println("Mult of " +a+ " and " +b+ " is " +f);
    
    float mod = a%b;//mod=a-(e*b)
    
	System.out.println(mod); 
		
	
	}

}

