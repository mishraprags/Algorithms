import java.util.Scanner;

public class Quicksort {
	public static void main(String args[]) {
		int arr[];
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Print number of elements");
		int num=input.nextInt();
		arr= new int[num];
		System.out.println("Enter array");
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();	
		}
		
		
		Quicksort s= new Quicksort();
		s.quicksort(arr,0 ,num-1);
		s.print(arr, num);
		
}

int partition(int[]arr,int low, int high) {
	int pivot=arr[(low+high)/2];
	while(low<=high) {
	while(arr[low]<pivot) {
			low++;
		}
	while(arr[high]>pivot) {
			high--;
		}
		if(low<=high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
	}
	return low;}

void quicksort(int arr[],int low, int high) {
	int pi=partition(arr,low,high);
	if(low<pi-1) {
		quicksort(arr,low,pi-1);
		}
	else if(pi<high) {
		quicksort(arr,low,high);
		}
	
}

void print(int arr[],int num) {
	System.out.println("Sorted array");
	for(int i=0;i<num;i++) {
		
		System.out.print(arr[i]+" "
				);
	}
	
}
}
