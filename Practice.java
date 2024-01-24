/*class Practice
{
public static void main(String args[])
{
	double b=10.23;
	int a=(int)b;
	System.out.println(b);
	System.out.println(a);
}
}
-------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	float a=138888;
	long b=(long)a;
	System.out.println(b);
}
}
----------------------------------------------------------------------------------
import java.util.*;
class Practice
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radis");
	double radius=sc.nextDouble();
	double pi=3.14;
	System.out.println(pi*radius*radius);
}
}
----------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int a=100,b=20,c=500;
	if(a>b && a>c)
		System.out.println("a is big");
	else if(b>c)
		System.out.println("b is big");
	else
		System.out.println("c is big");
}
}
----------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int yr=2023;
	if(yr%4==0 && yr%100!=0 || yr%400==0)
		System.out.println("year is leap year");
	else
		System.out.println("Not leap year");
}
}
--------------------------------------------------------------------------------------
import java.util.*;
class Practice
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length and breadth");
	int l=sc.nextInt();int b=sc.nextInt();
	System.out.println(2*l*b);
}
}
----------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int a=7,count=0;
	for(int x=2;x<=a/2;x++)
	{
		if(a%x==0)
		{
			count++;
		}
	}
	if(count==0)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("Not a prime");
	}
}
}
---------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int num=122,rev=0,rem=0;
	for(int n=num;n>0;n/=10)
	{
		rem=n%10;
		rev=rev*10+rem;
	}
	if(num==rev)
		System.out.println("PALINDROME");
	else
		System.out.println("NOT PALINDROME");
}
}
--------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int num=123,mul=0,rem=0,sum=0;
	for(int n=num;n>0;n/=10)
	{
		rem=n%10;
		mul=(int)Math.pow(rem,3);
		sum=sum+mul;
	}
	if(num==sum)
		System.out.println("ARMSTRONG");
	else
		System.out.println("NOT ARMSTRONG");
}
}
-------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int n=42759,max=4,rem=0,secmax=4;
	for(;n>0;n/=10)
	{
		rem=n%10;
		if(max<	rem)
		{
			max=rem;
		}
		else if(secmax<rem && max!=rem)
			secmax=rem;
	}
System.out.println(secmax);
}
}
--------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int count=0;
		for(int x=1;x<=50;x++)
		{
			if(x%2!=0)
			{
				count=0;
				for(int y=1;y<=x;y++)
				{
					if(x%y==0)
						count++;
				}
				if(count==2)
					System.out.println(x);
			}
		}
}
}
--------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	int num=145,fac=1,sum=0,rem=0;
	for(int n=num;n>0;n/=10)
	{
		rem=n%10;
		fac=1;
		for(int x=1;x<=rem;x++)
		{
			fac=fac*x;
		}
		sum=sum+fac;
	}
	if(sum==num)
		System.out.println("STRONG NUMBER");
	else
		System.out.println("NOT STRONG");
}
}
------------------------------------------------------------------------------------------
class Practice
{
public static void main(String args[])
{
	char c;int sum=0,n;
	String s=new String("A1B2C3");
	for(int x=0;x<s.length();x++)
	{
		if(s.charAt(x)>='0' && s.charAt(x)<='9')
		{
			
			c=s.charAt(x);
			 n=Character.getNumericValue(c);
			sum=sum+n;
		}
	}
System.out.println(sum);
}
--------------------------------------------------------------------------------------------------*/
class Practice
{
public static void main(String args[])
{	
	int count=1,x,y;
	int a[]=new int[]{1,2,2,3,4,2,5,6,5,7,8,9};
	boolean b[]=new boolean[a.length];
	for( x=0;x<a.length;x++)
	{
		if(b[x]=true)
			continue;
		count++;
		for( y=x+1;y<a.length;y++)
		{
			
			if(a[x]==a[y])
			{
				count++;
				b[y]=true;
			}
		}
		
	
		System.out.println(a[x]+"---> "+count);
	}
	
}
}

	