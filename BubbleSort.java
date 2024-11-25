package DailyDoseDay2;
import java.util.Scanner;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);  //taking the user input
		System.out.print("Enter the number of elements: ");  //user providing the total no. of array elements
		int n=in.nextInt();
		int a[]=new int[n];   //declaring the array
		System.out.println("Enter the array of elements: ");  //user providing the array elements
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for (int i=0;i<n-1;i++)  //sorting the elements by bubble sort
		{
			for(int j=0;j<n-(i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];  //swapping the numbers
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are:");  //printing the sorted array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
	}

}

