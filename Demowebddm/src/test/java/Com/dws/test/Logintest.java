package Com.dws.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.dws.pages.Addcart;
import Com.dws.pages.ConfirmOrder;
import Com.dws.pages.Confirmoder;
import Com.dws.pages.Login;
import Com.dws.pages.Payment;
import Com.dws.pages.Paymentinformation;
import Com.dws.pages.Register;
import Com.dws.utility.Config;

public class Logintest {
	
	
	
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Chrome1\\chromedriver.exe");
		Config.driver=new ChromeDriver();
		System.out.println("Chrome Open SuccessFuly");
	}
	
	@BeforeTest
	public void enterApplicationUrl()
	{
		Config.driver.get("http://demowebshop.tricentis.com/login");
		
	}

	@BeforeClass
	public void maximizeWindow()
	{
		Config.driver.manage().window().maximize();
		System.out.println("IN Maximize Before Class Annotation");
	}
	
	
	@BeforeMethod
	public void getAllCookies()
	{
		System.out.println("In GetAllCookies method under BeforeNethod");

		Set<Cookie> cookiess=Config.driver.manage().getCookies();

		for (Cookie cookie : cookiess) {

			System.out.println("Present Cookies Name--"+cookie.getName());
		}
	}



	
	
	
	@Test(dataProvider = "info",priority = 1)
	public void login(String email,String password)
	{  
		//Config.driver.get("http://demowebshop.tricentis.com/digital-downloads");
		Login login=PageFactory.initElements(Config.driver, Login.class);
		
		login.login(email,password);
	
	}
	
	
	
	  @Test(priority = 2) 
	  public void addtestt() {
	  
		Config.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Addcart login1=PageFactory.initElements(Config.driver, Addcart.class);
			login1.Addcartt();
	  
	  
	  }
	  @Test(priority = 3) 
	  public void confirmoder() {
	  
		Config.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			ConfirmOrder confirmOrder=PageFactory.initElements(Config.driver, ConfirmOrder.class);
			confirmOrder.ConfirmOrderr();;
	  
	  
	  }
	  
	  @Test(priority = 4) 
	  public void cod() {
	  
		Config.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Payment payment=PageFactory.initElements(Config.driver, Payment.class);
		payment.Paymenttc();
	  
	  
	  }
	  
	  @Test(priority = 5) 
	  public void paymentinfp() {
	  
		//Config.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Paymentinformation payment1=PageFactory.initElements(Config.driver, Paymentinformation.class);
		payment1.Paymenttc1();
	  
	  
	  }
	  
	  @Test(priority = 6) 
	  public void confirmoder1() {
	  
		//Config.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  Confirmoder confirmoder=PageFactory.initElements(Config.driver, Confirmoder.class);
		  confirmoder.confirm();
	  
	  
	  }
	  
	  
	  
	 
	/*@AfterMethod
	public void captureScreen() throws IOException
	{
		System.out.println("Capture ScreenShot Under AfterMethod");
		
		
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 FileUtils.copyDirectory(src, new File("D:\\TB8TB11\\TB12"));

		
		
		 System.out.println("Success Fuly");
		
	}*/

	
	
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("Delete All Cookies");
		Config.driver.manage().deleteAllCookies();
	}
	
	@DataProvider

	public Object[][] info(){
		return  new Object[][] {
			
			new Object[]{"1994ankitchoudhari@gmail.com","Ankit@1995"},
			//new Object[]{"Shubam","Raut","989090843003","aaa@gmail.com","aaa","aaa","aaa","aaa","aaa","aaa","aaa"}
			
			
		};
}
}
	
	
	
	


