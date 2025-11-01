package week3.day1;

public class OddIndexUpperCase {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				String s = "Changeme";
				char[] charArray=s.toCharArray();
				
				for (int i = 0; i < charArray.length; i++) {
					if(i==0)
						System.out.print(Character.toUpperCase(charArray[i]));
					else if(i%2==0)
						System.out.print(charArray[i]);
						else{
							System.out.print(Character.toUpperCase(charArray[i]));
						}
					
				}
				
	}

}
