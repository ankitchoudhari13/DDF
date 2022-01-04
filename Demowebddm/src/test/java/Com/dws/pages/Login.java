package Com.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	WebDriver driver;
	public Login(	WebDriver driver) {
		
		this.driver=driver;
	}

	
	@FindBy(xpath ="//*[@id=\"Email\"]")
	WebElement Email;
	
	@FindBy(xpath ="//*[@id=\"Password\"]")
	WebElement password;
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement login;
	
	
	public void login(String Email1,String password1) {
		
		Email.sendKeys(Email1);
		password.sendKeys(password1);
		login.click();
		
		
	}
	
}
