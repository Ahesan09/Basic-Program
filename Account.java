import java.util.*;
class Account
{
	Scanner sc = new Scanner(System.in);
	int Account_id;
	String Name;
	double Balance;
	void set()
	{
		System.out.println("Enter account number");
		Account_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		Name = sc.nextLine();
		System.out.println("Enter Balance");
		Balance = sc.nextInt();
	}
	void get()
	{
		System.out.println("Account_id= "+Account_id);
		System.out.println("Name= "+Name);
		System.out.println("Balance= "+Balance);
	}
	void search(int p,Account q[],int r)
	{
		for(int i=0;i<r;i++)
		{
			if(p==q[i].Account_id)
			{
				q[i].get();
				System.exit(0);
			}
			else
			{
				continue;
			}
		}
		System.out.println("data not found");
	}
}
class run
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Account");
		int n = sc.nextInt();
		Account a[] = new Account[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new Account();
			a[i].set();
		}
		System.out.println("Enter Account number you want to search");
		int x=sc.nextInt();
		Account ob = new Account();
		ob.search(x,a,n);
	}
}	