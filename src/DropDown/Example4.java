package DropDown;
public class Example4 
{
	public static void main(String[] args) 
	{
		int[] a= {3,7,1,9,5};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum=0;
		for(int b:a)
		{
			min=Math.min(min, b);
			max=Math.max(max, b);
			sum +=b;
		}
		System.out.printf("Largest sum = %d%nSmallest sum = %d%n", sum-min, sum-max);
	}
}