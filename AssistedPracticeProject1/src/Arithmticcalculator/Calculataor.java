package Arithmticcalculator;
import java.util.Scanner;

public class Calculataor
{

	public static void main(String[] args) 
	{
	

		    char operator;
		    Double a, b, result;
		    Scanner value = new Scanner(System.in);
		    
		    System.out.println("Enter first number");
		    a = value.nextDouble();

		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = value.next().charAt(0);

		    System.out.println("Enter second number");
		    b= value.nextDouble();

		    switch (operator)
		    {

		      case '+':
		        result = a + b;
		        System.out.println("Addition of two number is : "+(a+b));
		        break;

		     
		      case '-':
		        result = a - b;
		        System.out.println("Subtract of two number is : "+(a-b));
		        break;

		     
		      case '*':
		        result = a * b;
		        System.out.println("Multiply of two numbers : "+(a*b));
		        break;

		      
		      case '/':
		        result = a/b;
		        System.out.println("Division of two number is : "+(a/b));
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }
	}
}

		   