import java.util.*;
class Armstrome
{
	int n,r,c=0,temp1,temp2;
	double sum=0;
	void arm(int a)
	{
	    n=a;
		temp1=a;
		temp2=a;
		while(n>0)
		{
			n=n/10;
			c++;
		}
        while(temp1>0)
		{
			r=temp1%10;
			sum=sum+Math.pow(r,c);
			temp1=temp1/10;
		}			
		if(sum==temp2)
		{
		System.out.println("Given number is Armstrome number");
		}
		else
		{
			System.out.println("Given number is not Armstrome number");
		}
	}	
}	
class run
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Armstrome ob = new Armstrome();
		ob.arm(n);
	}
}