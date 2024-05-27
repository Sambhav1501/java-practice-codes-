import java.util.*;
import java.io.*;
class test
{
	public static void main(String args[])
	{
	try
		{
		FileOutputStream fos=new FileOutputStream("file2.txt");
		FileInputStream fis=new FileInputStream("file1.txt");
		int t=0;
		while((t=fis.read())!=-1)
		{
			fos.write((char)t);
		}
		fis.close();
		fos.close();
		}
	catch(IOException o)
	{
		o.toString();
	}
	}
}
