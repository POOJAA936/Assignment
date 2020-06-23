package DropDown;
public class Example5 
{
	public static void main(String[] args) 
	{
		
		int[] a= {10,13,15,18,20};
		for(int i=0;i<=20;i++)
		{
			while(!a.equals(i)) 
			{
				System.out.println(i);
				break;
			}
		}
		System.out.println("hello");
	}
}