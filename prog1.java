class Program1
{
public static void main(String args[])
{
int x,y,search=30,flag=0;
int low=a[0],high=a[a.length-1],mid=(low+high)/2;
int a[]=new int[]{10,20,30,40,50,60,70,80,90,100};
	for(x=0;x<a.length;x++)
	{
		for(y=0;y<a.length;y++)
		{
			if(a[mid]==search)
			{
				flag=1;
				break;
			}
			else if(a[mid]<search)
				low=mid+1;
			else
				high=mid-1;
			mid=(low+high)/2;
		}
	}
	if(flag==1)
		System.out.println("ELEMENT FOUND");
	else
		System.out.println("ELEMENT NOT FOUND);
}
}
	