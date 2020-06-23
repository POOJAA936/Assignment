package DropDown;
public class Example6 
{
	public static void test(int a)
	{
		if(a<=10)
		{
		System.out.println(a);
		a++;
		test(a);//recursion
		}
	}

}
