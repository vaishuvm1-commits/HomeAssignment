package week3.day1;

import week1.day2.Browser;

public class FindIntersection {
	int num2[] = {2,3,4,5,6,7,8,9};
	
	public void CheckDup() {
			int num3[] = {3,8,9};
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num3.length; j++) {
				
				if (num2[i]==num3[j]) {//3==4,3==5,3==1
					//4==4
					System.out.println(num2[i]);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		
		
		FindIntersection b = new FindIntersection();
		System.out.println("the duplicate values are");
		b.CheckDup();
		
		
		
		// TODO Auto-generated method stub

	}

}
