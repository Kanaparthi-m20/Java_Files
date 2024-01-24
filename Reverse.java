/*class Reverse
{
public static void main(String args[])
{
	String s=new String("Hello");
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	String s1=sb.toString();
	System.out.println(s1);
}
}*/
/*class Reverse
{
public static void main(String args[])
{
	String s=new String("hello");
	for(int x=s.length()-1;x>0;x--)
	{
	System.out.print(charAt(x)+" ");
	}

}
}*/
/*class Reverse
{
public static void main(String args[])
{
	String s=new String("hello");
	char a[]=s.toCharArray();
	for(int x=a.length-1;x>0;x--)
	{
	System.out.print(s.charAt(x));
	}
}
}*/
/*class Reverse
{
public static void main(String args[])
{
	String s=new String("madamoh");
	char a[]=s.toCharArray();
	int x;
	String str="";
	for(x=0;x<a.length;x++)
	{
		str=s.charAt(x)+str;
	}
	if(str.equals(s))
		System.out.println("PALINDROME");
	else
		System.out.println("NOT");
}
}*/
/*class Reverse
{
public static void main(String args[])
{
	String s=new String("hello all how are you");
	char a[]=s.toCharArray();
	int x,count=0,digit=0;
	for(x=0;x<a.length;x++)
	{
		if(s.charAt(x)=='a' || s.charAt(x)=='e' || s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u')
			count++;
		else
			digit++;
	}
System.out.println("vowels="+count);
System.out.println("CONSONANTS="+digit);
}
}*/
class Reverse
{
public static void main(String args[])
{
	String s=new String("hello");
	String str=s.replace('e','s');
	System.out.println(str);
}
}