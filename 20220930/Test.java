import java.util.Scanner;

public class Test {  
  public static void main(String[] args) { 
	int num1;
	int num2;
	int sum;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer:");
	num1 = input.nextInt();
	
	System.out.println("Enter second integer:");
	num2 = input.nextInt();
	
	sum = num1 +num2;
	if(sum >= 60)
		if(sum >= 70)
			System.out.println("This sum is 大於 70");
		else 
			System.out.println("This sum is 小於 60");
  }
}

