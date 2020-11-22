import java.util.Scanner;

public class Selectionsort {
	public static void main(String args[]) {
		int arr[];int temp;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter number of arrays");
		int num= input.nextInt();
		arr= new int[num];
		System.out.println("Enter elements");
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Sorted array");
		
	for(int i=0;i<num;i++) {
			 int min=i;
	         for (int j = i+1; j < num; j++)
	         { if (arr[j] < arr[min])
	               min = j;
	         }
			temp =arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
				
		}
	
		

for (int i=0; i<num; i++)
            System.out.print(arr[i]+" ");
        System.out.println();	
	
}
}
		
		
	
