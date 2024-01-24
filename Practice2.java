class Practice2
{
public static void main(String args[])
{
	String s=new String(" Hello All Good Morning");
		String a[]=s.split(" ");
		for(int x=a.length-1;x>0;x--)
		{
			System.out.println(a[x]);
		}
}
}