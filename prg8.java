import java.util.*;
class stringdemo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer("hello");
		System.out.println(s1);
		s1=s1.append("world");
		System.out.println(s1);
		StringBuffer s2=s1.insert(3,"new ");
		System.out.println(s2);
		StringBuffer s3=s1.delete(1,3);
		System.out.println(s3);
		StringBuffer s4=s1.replace(1,3,"old");
		System.out.println(s4);
		int l=s1.length();
		System.out.println("length="+l);
		StringBuffer s5=s1.reverse();
		System.out.println(s5);
	}
}

