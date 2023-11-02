/*class Vowels
{
	public static void main(String[] args)
	{
		String st1="Happy new year new";
		
		st1=st1.trim();
		
		
		Vo v=new Vo();
		v.vowelsCheck(st1);
		
	}

}

class Vo
{
	public void vowelsCheck(String st1)
	{
		String[] sa=st1.split(" ");
		int[] a=new int[sa.length];
		for(int i=0;i<sa.length;i++)
		{	
			int c=0;
			String u=sa[i].toLowerCase();
			char[] sy=u.toCharArray();
		for(int j=sa[i].length()-1;j>=0;j--)

		{
			if(sy[j]=='a'||sy[j]=='e'||sy[j]=='i'||sy[j]=='o'||sy[j]=='u')
		{
		c++;
		}
			
		}
		a[i]=c;
		
			
		}
	int max=0;
	for(int k=1;k<a.length;k++)
	{
		if(a[max]<a[k])
		{
			max=k;
		}
	}
 	System.out.println(sa[max]);
  	
	
		

	
	}

}
===============================================================================*/
class Highest
{
public static void main(String args[])
{
String s=new String("Happy eaiobb ouls New Year");
String a[]=s.split(" ");
String s1=" ";
int count=0;
int max=0;
for(int x=0;x<a.length;x++)
{
	s1=a[x];
	for(int y=0;y<s1.length();y++)
	{
		count=0;
		if(s1.charAt(y)=='a' || s1.charAt(y)=='e' || s1.charAt(y)=='i' || s1.charAt(y)=='o' || s1.charAt(y)=='u')
		{
			count++;
		}
	}
	
	if(max<count)
	{
		max=count;
		s1=a[x];
	}
}
System.out.println(s1);

}
}
