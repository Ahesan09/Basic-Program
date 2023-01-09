import java.util.*;
class Calculator
{ 
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a digit 1");
	double num1=sc.nextDouble();
	
	System.out.println("Enter a digit 2");
	double num2=sc.nextDouble();
	
	System.out.println("Enter a operator which you want to perform +,-,*,/");
	char operator=sc.next().charAt(0);
	
	double result;
	switch(operator)
	{
	case'+':
	result = num1+num2;
	break;
	
	case'-':
	result = num1-num2;
	break;
	
	case'*':
	result = num1*num2;
	break;
	
	case'/':
	result = num1/num2;
	break;
	
	default:
	System.out.println("Invalid Operator");
	return;
	}
	System.out.println(num1+" "+operator+" "+num2+": "+result);
	
	}
}	