package week3.day2;

public class LoginTestData  extends TestData {


	public void enterUsername(String username) {
		System.out.println("Enter the Username");
		System.out.println("Username is:" + " "+ username);
	}
	
       public void enterPassword(String password) {
			System.out.println("Enter the Password");
			System.out.println("Password is:" + " "+ password);
		}
	
	public static void main(String[] args) {
		
		LoginTestData L = new LoginTestData();
		L.enterCredentials();
		L.enterUsername("Manager");
		L.enterPassword("CMRFA5");
		
	}

}