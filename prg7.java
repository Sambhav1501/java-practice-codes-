import java.util.*;
class stringdemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1="hello my name is sambhav";
		System.out.println(s1);
		s1=s1.concat(" jain");
		int len=s1.length();
		System.out.println(s1);
		System.out.println("length="+len);
		s1=s1.replace("hello","hi");
		System.out.println(s1);
		int index=s1.indexOf("sambhav");
		System.out.println("index="+index);
		String s2=s1.substring(14);
		System.out.println(s2);
		String s3="HELLO";
		String s4=s3.toLowerCase();
		System.out.println(s3);
		System.out.println(s4);
		String s5=s4.toUpperCase();
		System.out.println(s5);
		String z="aaaabbc";
		int f=z.indexOf("a");
		System.out.println(z);
		System.out.println("first index="+f);
		String stringWithoutSpace=s1.trim();
		System.out.println(stringWithoutSpace);
		String words[]=s1.split(" ");
		for(String word:words)
		{
			System.out.println(word);
		}
	}
}

