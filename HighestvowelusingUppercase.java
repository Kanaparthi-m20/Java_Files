class HighestVowelusingUppercase
{
public static void main(String args[])
{
	String s=new String("heLLO all how are you welcome to the coding hub");
	String str=s.toUpperCase();
	//System.out.println(str);
	String a[]=str.split(" ");
	int count=0,max=0
;
	String str1="";
	for(int x=0;x<a.length;x++)
	{
		str1=a[x];
		for(int y=0;y<str1.length();y++)
		{
			count=0;
			if(str1.charAt(y)=='A' || str1.charAt(y)=='E' || str1.charAt(y)=='I' || str1.charAt(y)=='O'|| str1.charAt(y)=='U')
			{
				count++;
			}
		}
	}

	
	if(max<count)
	{
		max=count;
	System.out.println(s1.charAt(y));
	}
}
	

}
}