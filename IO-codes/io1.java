import java.util.*;
import java.io.*;
class io1
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("file1.txt");
		String s="Hello I am sambhav";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
}
