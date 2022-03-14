package page33_34_Array;

public class CwQ1SumAndAverage {

	public static void main(String[] args) {

	int[] a= {10,20,30,40,50,60,70,80,90};
	
	int sum=0,average;
	
	for (int i = 0; i < a.length; i++) 
	{
		sum=sum+a[i];
		
	}
	System.out.println("Sum is:"+sum);	
	
		average = sum/a.length;
	System.out.println("Average is: "+average);	
		
	

	
	
}}
