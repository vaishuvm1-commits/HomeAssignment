package week3.day1;

public class FindMissingElement {

	public static void main(String[] args) {
		   int[] arr = {1, 2,6,3, 4, 7};
		   
		   
		   int n = arr.length + 1; 
	        int expectedSum = n * (n + 1) / 2; 
	        int actualSum = 0;

	        for (int num : arr) {
	            actualSum += num;
	        }

	        System.out.println("Missing number: " + (expectedSum - actualSum));
	    }

	 
	}