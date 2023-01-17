import java.util.*;
class Distance
{
	int km,m;
	void set(int x,int y)
	{
		km=x;
		m=y;
	}
	void sum(Distance ob1,Distance ob2)
	{
		km=ob1.km+ob2.km;
		m=ob1.m+ob2.m;
	}
	void display()
	{
		while(m>=1000)
		{
			km=km+1;
			m=m-1000;
		}
		System.out.println("Km= "+km);
		System.out.println("meter= "+m);
	}
}
class run
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Distance T1 = new Distance();
		Distance T2 = new Distance();
		Distance T3 = new Distance();
		System.out.println("Enter kilometer for km1");
		int km1 = sc.nextInt();
		System.out.println("Enter meter for m1");
		int m1 = sc.nextInt();
		System.out.println("Enter kilometer for km2");
		int km2 = sc.nextInt();
		System.out.println("Enter meter for m2");
		int m2 = sc.nextInt();
		T1.set(km1,m1);
		T1.set(km2,m2);
		T3.sum(T1,T2);
		T3.display();
	}
}