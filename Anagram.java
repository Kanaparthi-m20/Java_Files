/*import java.util.*;
class Program2
{
public static void main(String args[])
{
	String s1=new String("silent");
	String s2=new String("listen");
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);

	if(s1.length()==s2.length())
	{
		if(Arrays.equals(a,b))
		{
			System.out.println("ANAGRAM");
		}
		else
		{
			System.out.println("NOT");
		}
	}
	else
		System.out.println("NOT");

	
}
}
===========================================================================================*/
import java.util.*;
class Program2
{
public static void main(String args[])
{
	String s1=new String("silnt");
	String s2=new String("listen");
	String a[]=s1.split("");
	String b[]=s2.split("");
	Arrays.sort(a);
	Arrays.sort(b);

	if(s1.length()==s2.length())
	{
		if(Arrays.equals(a,b))
		{
			System.out.println("ANAGRAM");
		}
		else
		{
			System.out.println("NOT");
		}
	}
	else
		System.out.println("NOT");

	
}
}
