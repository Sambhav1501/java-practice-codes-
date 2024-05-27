import java.util.*;
import java.io.*;
class ioc3
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		FileWriter fw=new FileWriter("file2.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String t="";
		while((t=br.readLine())!=null)
		{
			bw.write(t);
			bw.write("\n");
		}
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}
}
