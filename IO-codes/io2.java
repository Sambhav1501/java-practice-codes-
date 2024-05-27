import java.util.*;
import java.io.*;
class io2
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		int t=0;
		while((t=fis.read())!=-1)
		{
			System.out.print((char)t);
		}
		System.out.println();
		fis.close();
	}
}
