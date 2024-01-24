class Practice5
{
public static void main(String args[])
{
	String s=new String("Hello All Good Morning");
	String a[]=s.split(" ");
	int x,y;
	String str="";
	String str1="";
	for(x=0;x<a.length;x++)
	{
		
		if(x%2==0)
		{
			str=a[x];
			for(y=0;y<str.length();y++)
			{
				str1=str.charAt(y)+str1;
			}

			if(str.equals(str1))
				System.out.println("palindrome");
			else
				System.out.println("NOT");
		}
	}
}
}