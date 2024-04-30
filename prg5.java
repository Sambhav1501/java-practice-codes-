import java.util.*;
class election
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count[]={0,0,0,0,0};
		String name[]={"a","b","c","d","e"};
		int n=0;
		System.out.println("enter \n1 for a\n2 for b\n3 for c\n4 for d\n5 for e\n");
		n=sc.nextInt();
		int trash=0;
		while(n!=0)
		{
			if(n>=1&&n<=5&&n!=0)
			count[n-1]+=1;
			else
			trash=trash+1;
			System.out.println("enter \n1 for a\n2 for b\n3 for c\n4 for d\n5 for e");
			System.out.println("enter 0 to calculate result");
			n=sc.nextInt();
		}
		float per=0.0f;
		int tot_votes=0;
		for(int x:count)
		{
			tot_votes+=x;
		}
		//System.out.println("Total Votes:" + tot_votes);
		System.out.println("Candidate name\tVotes recieved\tpercentage");
		for(int i=0;i<5;i++)
		{
			per=(float)count[i]/tot_votes*100;
			
			System.out.println(name[i]+"\t\t"+count[i]+"\t\t"+ per);
		}
	}
}
