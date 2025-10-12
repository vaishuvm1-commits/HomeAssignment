package week1.day1;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		byte age = 30;
		double salary = 55000.75;
		char gender = 'M';
		boolean acceptTerms = true;
		float rating = 4.5f;
		long mobileNumber = 9876543210L;
		int pinCode = 56001;
		byte luckyNumber = 7;
		String name = "John Doe";
		
		System.out.println("Employee Details are displayed below \n  Name : " +name+ 
				"\n  Age :" +age+ "\n  Salary : " +salary+
				"\n  Gender : " +gender+ "\n  Accepts Terms of the Organization :"+acceptTerms+
				"\n  Rating : " +rating+ "\n "
				+ " Mobile Number : " +mobileNumber+
		      "\n  Pin Code : " +pinCode+ "\n  Lucky Number : " +luckyNumber );
	}

}
