package Java;

import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	
	System.out.println("Enter the number to check : ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	
	boolean isPrime=true;
	
	for(int i=2;i<num;i++) {
		
		if(num%i==0) {
			isPrime=false;
		}
	}
	
	if(isPrime) {
		
		System.out.println("The given number "+num+" is a prime number");
	}
	
	else {
		System.out.println("The given number "+num+" is not a prime number");
	}
}
}
