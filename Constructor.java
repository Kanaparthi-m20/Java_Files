class Constructor
{
	public static void main(String args[])
	{
		Add a1=new Add();
		a1.display();
	}

}
class Add
{
	int x,y,c;
	Add()
	{
		x=10;y=19;
	}
	
	public void display()
	{
		c=x+y;
		System.out.println(c);
	}
}