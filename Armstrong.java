import java.util.*;
class Armstrong
{ 
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
   	System.out.println("Enter a number");
	int num=sc.nextInt();
	int temp1=num;
	int temp2=num;
	int digit=0;
	int sum=0;
	while(temp1>0)
	{
		temp1=temp1/10;
		digit++;
	}
	while(temp2>0)
	{
		int r=temp2%10;
		sum+=Math.pow(r,digit);
		temp2=temp2/10;
	}	
	if(num==sum)
	{
		System.out.println("Given number is Armstrong number");
	}	
	else
	{	
		System.out.println("Given number is not Armstrong number");
	}	
	} 
}	