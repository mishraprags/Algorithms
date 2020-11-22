import java.util.Scanner;

public class Bubblesort {
	public static void main(String arg[]) {
		int arr[];
		int temp;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num =input.nextInt();
		arr=new int[num];
		System.out.println("Enter elements of array");
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();
		}
		
	for (int i = 0; i < num; i++) 
		      arr[i] = input.nextInt();
		 
for (int i = 0; i < num ; i++) {
for (int j = 0; j < num -1; j++) {
		        if (arr[j] > arr[j+1]) 
		        {
		            temp = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1] =temp;
}
}}
for(int i = 0; i < num; i++)
System.out.println(arr[i] +" ");
	}
}


		  
		




		
		
	

