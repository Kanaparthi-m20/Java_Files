class Practice4
{
public static void main(String args[])
{
	String s=new String("Hello All Good Morning");
	String a[]=s.split(" ");
	int x;
	for(x=0;x<a.length;x++)
	{
		if(x%2==0)
		{
			System.out.println(a[x]);
		}
	}
}

}