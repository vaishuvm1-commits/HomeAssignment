package week3.day2;



public class Element {

	public static void main(String[] args) {
		
		button button = new button();
		button.click();
		button.setText("success");
		button.submit();
		
		TextField textfield = new  TextField();
		textfield.setText("hello world");
		textfield.getText();
		
		CheckBoxButton checkboxbutton = new CheckBoxButton();
		checkboxbutton.click();
		checkboxbutton.clickCheckButton();
		
		RadioButton radiobutton = new RadioButton();
		radiobutton.click();
		radiobutton.selectRadioButton();
		
		System.out.println("Execution Completed");
		
	}

}