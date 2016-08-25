package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helpers.TestDataProvider;
import pageObjects.AutomationHomePage;

public class SignIn extends TestDataProvider
{
	private static WebDriver driver = null;
	WebDriverWait wait=new WebDriverWait(driver, 5);
	
	@BeforeTest
	public void loadlink() throws Exception
	{
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://automationpractice.com/index.php");
		wait.until(ExpectedConditions.titleContains("My Store"));
		Thread.sleep(12000);
		AutomationHomePage.headerClass.home_SignIn(driver).click();
		Thread.sleep(5000);
		
	}
	
	@DataProvider(name="DP1")
	public Object[][] createData() throws Exception
	{
		Object[][] signinData=readData("D:\\AutomationPracticeNew.xls", "TestDataForSignIn");
		return(signinData);
	}

	@Test(dataProvider = "DP1")
	//,dependsOnMethods={"forgotpassword"}
	public void SignInVerify(String username, String Password) throws Exception
	{
		//LoginPage.SignInemail(driver).sendKeys(username);
		//LoginPage.SignInpasswd(driver).sendKeys(Password);
		//LoginPage.SubmitLogin(driver).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).clear();
		driver.findElement(By.id("passwd")).sendKeys(Password);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(6000);
		
		if(driver.getPageSource().contains("Sign in"))
		{
			Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/p")).getText().matches("There is 1 error"));
			System.out.println("Login Failed" + driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText());
			Reporter.log("Login Failed" + driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText());
		}
		
		else
		{
			Assert.assertTrue(driver.findElement(By.linkText("Sign out")).isEnabled());
			Reporter.log("Login Successfull");
			System.out.println("Login Successfull");
			
		}
		
	/*@Test
	public void forgotpassword() throws Exception
	{
		driver.findElement(By.xpath("//p[@class='lost_password form-group']//a")).click();
		if(driver.findElement(By.xpath("//h1[@class='page-subheading']")).getText().matches("Forgot your password?"))
			Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span//i[@class='icon-chevron-left']")).click();
	}*/
	
	}
}


