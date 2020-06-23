package DropDown;
public class Sample2 
{
	void disp()
	{
		System.out.println("hello");
	}
}
class Demo extends Sample2
{
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		s2.disp();
	}
}