import java.util.*;
class Saddle
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=0,m=0;
		System.out.print("enter the no of rows and coloums");
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int i=0,j=0,k=0;
		int min=0;
		int indx=0;
		int max=0;
		for(i=0;i<n;i++)
		{
			min=arr[i][0];
			for(j=0;j<m;j++)
			{
				if(min>arr[i][j])
				{
					indx=j;
					min=arr[i][j];
				}
			}
			for(k=0;k<n;k++)
			{
				max=arr[k][indx];
				if(max<arr[k][indx])
				{
					max=arr[k][indx];
				}
			}
			if(max==min)
			{
				System.out.println("saddle point : "+max);
			}
		}
	}
}
