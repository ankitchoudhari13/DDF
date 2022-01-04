package Com.dws.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.dws.utility.Config;

public class Addcart {

	  @FindBy(xpath ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")
	  WebElement clicklink;
	  @FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	  WebElement click;
	  
	  
	  
	  @FindBy(xpath ="//*[@id=\"topcartlink\"]/a") 
	  WebElement Addcart;
	  
	  @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input")
	  
	  WebElement Addcart1;
	  
	/*
	 * @FindBy(xpath ="//*[@id=\"termsofservice\"]")
	 * 
	 * WebElement click1;
	 */
	  
	  @FindBy(xpath ="//*[@id=\"termsofservice\"]") 
	  WebElement checkoutt;
	  
	  @FindBy(xpath ="//*[@id=\"checkout\"]")
	  WebElement chekout1;
	  
	  
	  public void Addcartt() {
		  clicklink.click();
	  click.click(); 
	  Addcart.click(); 
	  Addcart1.click(); 
	 // click1.click();
	  checkoutt.click(); 
	  chekout1.click();
	  
	  
	  }
	 
}
