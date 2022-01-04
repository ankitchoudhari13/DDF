package Com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	
	@FindBy(xpath ="//*[@id=\"paymentmethod_0\"]")
	  WebElement paymentt;
	
	@FindBy(xpath ="//*[@id=\"payment-method-buttons-container\"]/input")
	  WebElement submitt;
	  
public void	  Paymenttc(){
	
	paymentt.click();
	submitt.click();
	
	
	  }


}
