package order;

public class Unsortedlist {
	public void sortArr(int arr[])  
	{  
	int size = arr.length;  
	  
	for(int i = 0; i < size; i++)  
	{  
	int temp = i;  
	for(int j = i + 1; j < size; j++)  
	{  
	if(arr[temp] > arr[j])  
	{  
	temp = j;  
	}  
}  
	  
	if(temp != i)  
	{  
	int t = arr[i];  
	arr[i] = arr[temp];  
	arr[temp] = t;   
	}}}  
	  
	// find the kth smallest element of the array  
	public int findKthSmallest(int arr[], int k)  
	{  
	sortArr(arr);  
	  
	// as an array is always a zero indexing  
	// therefore, the kth smallest element lies  
	// at the k - 1 index  
	return arr[k - 1];  
	}  
	  
	// main method  
	public static void main(String argvs[])  
	{  
	  
	// creating an object of the class KthSmallestEle  
		Unsortedlist obj = new Unsortedlist();  
	  
	int arr[] = {12, 3, 5, 7, 4, 19, 26};  
	  
	int size = arr.length;  
	int k = 4;  
	  
	System.out.println("For the array: ");  
	for(int i = 0; i < size; i++)  
	{  
	System.out.print(arr[i] + " ");  
	}  
	  
	int ele = obj.findKthSmallest(arr, k);  
	  
	System.out.println();  
	System.out.println("The " + k + "rd smallest element of the array is: " + ele);
	}}