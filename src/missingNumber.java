import java.util.ArrayList;
import java.util.List;

public class missingNumber {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,5,6,8,9,15};
		System.out.println("Missing Elements are: "+missingN0(a));
	}
	
	public static List<Integer> missingN0(int arr[]) { 
		if(arr==null||arr.length==0)
			return null;
		// To store missing numbers
		List<Integer> missing = new ArrayList<Integer>();
		findMissing(arr, 0, arr.length - 1, missing);
		return missing;
	}
	
	//Recursive Function
	public static void findMissing(int arr[], int start, int end, List<Integer> missing) {
		if(start < end) {
			
			// To check if anything is missing or not
			if(arr[end] - arr[start] == end - start) {      // No missing elements
				return ;
			}
			
			// Finding missing numbers
			else {                                          // Elements are missing
				
				// When only 2 elements are left in the array after dividing
				if(end - start == 1) {            
					int temp = arr[start] + 1;
					while(temp != arr[end]) {
						missing.add(temp);
						temp = temp+1;
					}
				}
				// Dividing the array into 2 parts
				else {
					int mid = start+(end-start)/2;
					findMissing(arr, start, mid, missing);   
					findMissing(arr, mid, end, missing);       
				}
				
				
			}
		}
	}
}