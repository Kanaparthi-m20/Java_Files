/*class Conpalin
{
public static void main(String args[])
{
	Palindrome p1=new Palindrome();
	p1.display();
	
}
}
class Palindrome
{
	String str;String str1="";
	Palindrome()
	{
		str="madam";
	}
	public void display()
	{
		for(int x=0;x<str.length();x++)
		{
			str1=str.charAt(x)+str1;
		}
		if(str1.equals(str))
			System.out.println("P");
		else
			System.out.println("N");

	}
}*/
/*
class Conpalin
{
public static void main(String args[])
{
	Palindrome p1=new Palindrome("madam");
	p1.display();
	
}
}
class Palindrome
{
	String str;String str1="";
	Palindrome(String str)
	{
		this.str=str;
	}
	public void display()
	{
		for(int x=0;x<str.length();x++)
		{
			str1=str.charAt(x)+str1;
		}
		if(str1.equals(str))
			System.out.println("P");
		else
			System.out.println("N");

	}
}*/
class Conpalin
{
public static void main(String args[])
{
	Palindrome p1=new Palindrome();
	//p1.display();
	
}
}
class Palindrome
{
	String str;String st="";
	Palindrome()
	{
		String str=new String("madam");
		StringBuffer sb=new StringBuffer(str);
		//sb.reverse();
		st=sb.reverse().toString();
	if(st.equals(str))
		System.out.println("P");
	else
		System.out.println("NP");	
	}
}