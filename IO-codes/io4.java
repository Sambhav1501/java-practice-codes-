import java.util.*;
import java.io.*;
class io4
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("file2.txt");
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int t=0;
		while((t=bis.read())!=-1)
		{
			bos.write((char)t);
		}
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	}
}
