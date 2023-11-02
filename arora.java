/*class Main
{
public static void main(String args[])
{
	String s=new String("madam arora teaches malayalam");
	String []a=s.split(" ");
	int x,y;
	for(x=0;x<a.length;x++)
	{
	String r=new String(a[x]);
	
		String rev=new String();
		for(y=r.length()-1;y>=0;y--)
		{
			char c=r.charAt(y);
			rev=rev+c;
		}
		if(r.equals(rev))
		System.out.println(rev);
		}
		
		
	
		
}
}
=====================================================================================*/
class Main
{
public static void main(String args[])
{
	String s=new String("madam arora teaches malayalam");
	String []a=s.split(" ");
	String str="";
	for(int x=0;x<a.length;x++)
	{
		s=a[x];
		str="";
		for(int y=s.length();y>0;y--)
		{
			str=str+s.charAt(y);
		}
		if(s.equals(str))
			System.out.println(s);
	}
}

}