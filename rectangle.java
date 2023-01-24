import java.util.*;
class rectangle
{   
	int a,b;
	void area(int p,int q)
	{
		a=p;
		b=q;
		int area = a*b; 
		System.out.println(area);
	}
	void perimeter(int p,int q)
	{
		a=p;
		b=q;
		int perimeter = 2*(a+b);
		System.out.println(perimeter);
	}	
}
class run
{
	public static void main(String args[])
	{
		rectangle ob = new rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		System.out.println("Enter breadth");
		int b = sc.nextInt();
		ob.perimeter(l,b);

		
	}
}