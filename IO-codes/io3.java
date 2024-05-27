import java.util.*;
import java.io.*;
class io3
{
	public static void main(String args[])throws IOException
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
}
