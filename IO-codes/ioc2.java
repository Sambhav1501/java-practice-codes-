import java.util.*;
import java.io.*;
class ioc2
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		FileWriter fw=new FileWriter("file2.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		int t=0;
		while((t=br.read())!=-1)
		{
			bw.write((char)t);
		}
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}
}
