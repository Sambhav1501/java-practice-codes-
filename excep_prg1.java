import java.util.*;
class exp_prg1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try
		{
			System.out.println("divide:"+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividing by zero");
		}
	}
}
