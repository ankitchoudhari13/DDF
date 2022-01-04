package Com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	public Register() {
		
	}
	
	@FindBy(xpath = "//*[@id=\"gender-female\"]")
	WebElement click;
	
	@FindBy(xpath ="//*[@id=\"FirstName\"]")
	WebElement fname;
	
	@FindBy(xpath ="//*[@id=\"LastName\"]")
	WebElement lname;
	@FindBy(xpath ="//*[@id=\"Email\"]")
	WebElement email;
	@FindBy(xpath ="//*[@id=\"Password\"]")
	WebElement pass;
	@FindBy(xpath ="//*[@id=\"ConfirmPassword\"]")
	WebElement cpass;
	@FindBy(xpath ="//*[@id=\"register-button\"]")
	WebElement button;
	
	
	public void Reg(String name,String lastname,String mail,String pass1,String cpass1) {
		click.click();
		fname.sendKeys(name);
		lname.sendKeys(lastname);
		email.sendKeys(mail);
		pass.sendKeys(pass1);
		cpass.sendKeys(cpass1);
		button.click();
		
		
	}

}
