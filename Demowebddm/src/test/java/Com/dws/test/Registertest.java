package Com.dws.test;

import java.util.Set;

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

import Com.dws.pages.Login;
import Com.dws.pages.Register;
import Com.dws.utility.Config;


public class Registertest {
	
	
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
		Config.driver.get("http://demowebshop.tricentis.com/register");
		
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



	
	@Test(dataProvider = "info")
	public void Registerr(String name,String lastname1,String mail,String pass1,String cpass1)
	{  
		
		Register regist=PageFactory.initElements(Config.driver, Register.class);
		regist.Reg(name, lastname1, mail, pass1, cpass1);
	}
	
	
	
	@Test(dataProvider = "info")
	public void login(String email,String password)
	{  
		
		Login login=PageFactory.initElements(Config.driver, Login.class);
		login.login(email,password);
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
			
			new Object[]{"Ankit","choudhari","aaa@gmail.com","Ankit@1995","Ankit@1995"},
			//new Object[]{"Shubam","Raut","989090843003","aaa@gmail.com","aaa","aaa","aaa","aaa","aaa","aaa","aaa"}
			
			
		};
}
} 
	
	


