import java.util.*;
class name_roll
{
	int roll_no;
	String name;
	Scanner sc = new Scanner(System.in);
	void set()
	{
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter Roll no");
		roll_no = sc.nextInt();
	}
	void get()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll no"+roll_no);
	}
}
class run
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of object");
		int n = sc.nextInt();
		name_roll arr[]=new name_roll[n];
		int count =0;
		for(int i=0;i<n;i++)
		{
			arr[i]=new name_roll();
			arr[i].set();
		}
		System.out.println("Enter Roll no you want to search");
		int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(x==arr[i].roll_no)
			{
				arr[i].get();
			}
			else
			{
				count++;
			}
		}
		if(count==n)
		{
			System.out.println("Match not found");
		}
	}
}