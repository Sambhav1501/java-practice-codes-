import java.util.*;
class TellCall
{
	String phno;
	String sname;
	int n;
	double amt;
	TellCall(String name,String no,int a)
	{
		phno=no;
		sname=name;
		n=a;
	}
	void compute()
	{
		if(n<=100)
		{
			amt=500;
		}
		else if(n<=200)
		{
			amt=500+((n-100)*1);
		}
		else if(n<=300)
		{
			amt=500+100+((n-200)*1.2);
		}
		else
		{
			amt=500+100+120+((n-300)*1.5);
		}
	}
	void display()
	{
		System.out.println("Name="+sname);
		System.out.println("Phone no="+phno);
		System.out.println("No of calls="+n);
		System.out.println("Total amount="+amt);
	}	
}

class BillDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		String name;
		String no;
		System.out.print("Enter name");
		name=sc.next();
		System.out.print("Enter phone no");
		no=sc.next();
		System.out.print("Enter no of calls");
		n=sc.nextInt();
		TellCall obj1= new TellCall(name,no,n);
		obj1.compute();
		obj1.display();
	}
}
