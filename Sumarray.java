import java.util.*;
class Sumarray
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		Scanner sa=new Scanner(System.in);
		System.out.print("Enter array values");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sa.nextInt();
			sum=a[x]+sum;
		}
		System.out.println(sum);

	}
}
