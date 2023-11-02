class Parameterized
{
	public static void main(String args[])
	{
		Add a1=new Add();
		a1.display();
		Add a2=new Add(10);
		
	}
}
class Add
{
int x,y,c;
	Add()
	{
		x=10;y=20;
	}
	public void display()
	{
		c=x+y;
		System.out.println(c);
	}
	Add(int a)
	{
	
		System.out.println(x+" "+y);
	}
}