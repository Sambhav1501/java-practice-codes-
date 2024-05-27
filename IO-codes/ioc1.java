import java.util.*;
import java.io.*;
class ioc1
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		FileWriter fw=new FileWriter("file2.txt");
		int t=0;
		while((t=fr.read())!=-1)
		{
			fw.write((char)t);
		}
		fr.close();
		fw.close();
	}
}
