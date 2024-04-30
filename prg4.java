import java.util.*;
class FriendlyPair
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Enter numbers");
		int flag=0;
		num1=sc.nextInt();
		num2=sc.nextInt();
		byte i=0;
		int sum1=0,sum2=0;
		for(i=1;i<=num1/2;i++)
		{
			if(num1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(i=1;i<=num2/2;i++)
		{
			if(num2%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(num1==sum1&&sum2==num2)
		{
			System.out.print(num1+" and "+num2+" are a friendly pair");
		}
		else
		{
			System.out.print(num1+" and "+num2+" are not a friendly pair");
		}
	}
}
