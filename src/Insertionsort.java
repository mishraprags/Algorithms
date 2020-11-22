import java.util.Scanner;

public class Insertionsort {
	public static void main(String args[]) {
		int arr[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num =s.nextInt();
		arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=s.nextInt();
		}
		
		 
			int j; int temp;
		
		for (int i=1;i<num;i++) {
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}
		System.out.print("Sorted array using insertion sort");
	for(int i=0;i<num;i++) {
		System.out.print(arr[i]+" ");
	
	
	}
	

	}
	}

