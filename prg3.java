import java.util.*;
class BankAcc
{
	String name;
	String acno;
	String type;
	int bal;
	BankAcc(String name,String acno,String type,int bal)
	{
		this.name=name;
		this.acno=acno;
		this.type=type;
		this.bal=bal;
	}
	void deposit(int amt)
	{
		bal=bal+amt;
	}
	void withDraw(int amt)
	{
		if(amt>bal)
		{
			System.out.println("Amount not available");
		}
		else
		{
			bal=bal-amt;
			System.out.println("Amount withdrawl successful");
		}
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Balance="+bal);
	}
}
class BankDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		String acno;
		String type;
		int bal;
		int amt;
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Account no");
		acno=sc.next();
		System.out.println("Enter Account type s for saving ,c for current");
		type=sc.next();
		System.out.println("Enter bal");
		bal=sc.nextInt();
		BankAcc ob1=new BankAcc(name,acno,type,bal);
		ob1.deposit(100);
		ob1.withDraw(50);
		ob1.display();
	}
}
