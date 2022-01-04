package Com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paymentinformation {
	

	@FindBy(xpath ="//*[@id=\"payment-info-buttons-container\"]/input")
	  WebElement paymentt1;
	
	/*
	 * @FindBy(xpath ="//*[@id=\"payment-method-buttons-container\"]/input")
	 * WebElement submitt;
	 */

	
	public void	  Paymenttc1(){
		
		paymentt1.click();
		//submitt.click();
		
		
		  }
	
	
	
	
}
