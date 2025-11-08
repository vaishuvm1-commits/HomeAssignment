package week4.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> elements = new ArrayList<String>();
		elements.add("HCL");
		elements.add("Wipro");
		elements.add("Aspire Systems");
		elements.add("CTS");

		Collections.sort(elements);

		List<String> elementTwo = new ArrayList<String>();
		
		elementTwo.addAll(elements);
		Collections.reverse(elementTwo);
		System.out.println(elements );
		System.out.println(elementTwo );
		System.out.println("The contents in Reverse order is:  ");
		
		for (int i=elements.size()-1;i>=0;i--) {
			
			System.out.print(elements.get(i));
			if(i!=0) {
				System.out.print(", " );
			}
		}
		
		
		
	}
	

}
