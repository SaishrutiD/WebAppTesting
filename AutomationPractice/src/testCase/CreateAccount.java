package testCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AutomationHomePage;
import pageObjects.CreateAccount_PersonalInfoPage;
import pageObjects.LoginPage;
import Helpers.TestDataProvider;

public class CreateAccount extends TestDataProvider {
private static WebDriver driver = null;
Properties prop;
@BeforeClass
	
	public void LoadPage() throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(12000);
		AutomationHomePage.headerClass.home_SignIn(driver).click();
	}
	
	@DataProvider(name="DP1")
	public Object[][] createData() throws Exception
	{
		Object[][] signinData=readData("D:\\AutomationPracticeNew.xls", "TestDataForCreateAccount");
		return(signinData);
	}

	@Test(dataProvider = "DP1")
	public void createAccount(String type, String email) throws Exception
	{
		
		String title=driver.findElement(By.cssSelector("h3")).getText();
		if(title.equalsIgnoreCase("Create an account"))
		{
			LoginPage.emailCreate(driver).clear();
			LoginPage.emailCreate(driver).sendKeys(email);
			LoginPage.SubmitCreate(driver).click();
		}
		//checks for valid input and create account by getting input data from dataFile properties file
		try{
			
			String text=driver.findElement(By.xpath(".//*[@id='account-creation_form']/div[1]/h3")).getText();
			Assert.assertEquals(text, "YOUR PERSONAL INFORMATION");
			Thread.sleep(3000);
			
			try{
			 // Create FileInputStream Object  
			 FileInputStream fileInput = new FileInputStream(new File("D:\\Workspace\\AutomationPractice\\src\\dataFile.properties"));  
			 // Create Properties object  
			 prop = new Properties();  
			 //load properties file  
			 prop.load(fileInput); }
			catch (FileNotFoundException e) {  
				 e.printStackTrace();  
				     } catch (IOException e) {  
				 e.printStackTrace();  
				     } catch (NoSuchElementException e) {  
				 e.printStackTrace();  
				     } 
			
			/* Providing all the input data to create account */
			Thread.sleep(5000);
			CreateAccount_PersonalInfoPage.PersonalInfo.Title_Mrs(driver).click();
			CreateAccount_PersonalInfoPage.PersonalInfo.FirstName(driver).sendKeys(prop.getProperty("customer_firstname"));
			Thread.sleep(2000);
			CreateAccount_PersonalInfoPage.PersonalInfo.LastName(driver).sendKeys(prop.getProperty("customer_lastname"));
			//driver.findElement(By.id("email")).getText().contains(".com");
			CreateAccount_PersonalInfoPage.PersonalInfo.Password(driver).sendKeys(prop.getProperty("passwd"));
			new Select(CreateAccount_PersonalInfoPage.PersonalInfo.DOB_date(driver)).selectByValue(prop.getProperty("days"));
			new Select(CreateAccount_PersonalInfoPage.PersonalInfo.DOB_month(driver)).selectByValue(prop.getProperty("months"));
			new Select(CreateAccount_PersonalInfoPage.PersonalInfo.DOB_year(driver)).selectByValue(prop.getProperty("years"));
			
			//Provide Address details
			CreateAccount_PersonalInfoPage.AddressInfo.AddressLine(driver).sendKeys(prop.getProperty("passwd"));
			CreateAccount_PersonalInfoPage.AddressInfo.City(driver).sendKeys(prop.getProperty("city"));
			new Select(CreateAccount_PersonalInfoPage.AddressInfo.State(driver)).selectByVisibleText(prop.getProperty("id_state"));
			CreateAccount_PersonalInfoPage.AddressInfo.Postalcode(driver).sendKeys(prop.getProperty("postcode"));
			CreateAccount_PersonalInfoPage.AddressInfo.MobileNumber(driver).sendKeys(prop.getProperty("phone_mobile"));
			CreateAccount_PersonalInfoPage.AddressInfo.AddressAlias(driver).sendKeys(prop.getProperty("alias"));
			CreateAccount_PersonalInfoPage.AddressInfo.SubmitButton(driver).click();
			Thread.sleep(3000);
			Actions.AccountCreateVerificationAction.Execute(driver);

}
		catch(Throwable e)
		{
		System.out.println("Account cannot be created");
		Reporter.log("invalid email address");
		}
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		try 
		{
		// Create refernce of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		// Call method to capture screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		// Copy files to specific location here it will save all screenshot in our project home directory and
		// result.getName() will return name of test case so that screenshot name will be same
		FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
		 
		System.out.println("Test Failed, Screenshot taken");
		} 
		catch (Exception e)
		{
		 
		System.out.println("Exception while taking screenshot "+e.getMessage());
		Assert.fail();
		} 
		 
	}
}
}
