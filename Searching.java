package DailyDoseDay2;
import java.util.Scanner;
public class Searching 
{
	static void searchElement(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				System.out.print("Element found at"+arr[i]);
			}
			else
			{
				System.out.print("Element not found ");
			}
		}
	}
	public static void main(String[] args) 
	{		
		Scanner in =new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.print("Enter element to be searched: ");
		int key=in.nextInt();
		
		searchElement(arr,key);
	}
}
