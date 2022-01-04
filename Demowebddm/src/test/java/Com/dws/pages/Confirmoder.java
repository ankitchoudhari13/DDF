package Com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmoder {
	
	
	
	@FindBy(xpath ="//*[@id=\"confirm-order-buttons-container\"]/input")
	  WebElement confirmoder;

	
	
	
	
	public void confirm() {
		
		confirmoder.click();
		
	}
}
