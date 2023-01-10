import java.util.*;
class circle
{
	double r,Area;
	double p=Math.PI;
	void area(double x)
	{
		r=x;
		Area=p*r*r;
		System.out.println("Area:"+Area);
	}
}	
class run
{
	
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double n = sc.nextDouble();
		circle ob = new circle();
		ob.area(n);
	}
}