package DropDown;
public class Sample1 
{
	public static void main(String[] args) 
	{
		String x = "hello java";
		System.out.println(x.length());

		System.out.println(x.charAt(7));
		
		System.out.println(x.indexOf('l', 3));
		
		System.out.println(x.indexOf('l'));
		
		System.out.println(x.contains("hel"));
		
		System.out.println(x.substring(3));
		
		System.out.println(x.substring(2, 9));
		
		System.out.println(x.split(" "));
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.startsWith("hel"));
		
		System.out.println(x.startsWith("llo", 2));
		
		System.out.println(x.endsWith("va"));
		
		System.out.println(x.lastIndexOf('l'));
		
		System.out.println(x.lastIndexOf('a', 9));
	}
}