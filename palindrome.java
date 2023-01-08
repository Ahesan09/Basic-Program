import java.util.*;
class palindrome
{ 
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num = sc.nextInt();
	 int originalnum= num;
	 int reversenum= 0;
	 while(num!=0)
	{
		int lastdigit = num%10;
		reversenum = (reversenum*10)+lastdigit;
		num=num/10; 
	}
	 if(originalnum==reversenum)
	{
		System.out.println("Given number is palindrome number"); 
	}
	 else{
		System.out.println("Given number is not palindrome number"); 
	}
	 
	 
	}
}