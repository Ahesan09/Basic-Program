import java.util.*;
class pelindrome
{
	int n,r,temp,sum=0;
	void peli(int a)
	{
	n=a;
	temp=a;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Number is pelindrome");
	}
	else
	{
		System.out.println("Number is not pelindrome");
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
		pelindrome ob = new pelindrome();
		ob.peli(n);
		
	}
}