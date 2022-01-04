package Com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrder {
	
	  @FindBy(xpath ="//*[@id=\"billing-buttons-container\"]/input")
	  WebElement confirm;
	  
public void	  ConfirmOrderr(){
	
	confirm.click();
	
	
	  }

}
