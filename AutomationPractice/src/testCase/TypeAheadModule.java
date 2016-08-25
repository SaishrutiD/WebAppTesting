package testCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AutomationHomePage;;

/* This script will test the search autocomplete of the AUT*/

public class TypeAheadModule {

	static WebDriver driver;
	List<WebElement> lst; 

	@BeforeTest
	public void loadUrl() throws InterruptedException
	{
		String baseUrl;
		driver = new FirefoxDriver();
		baseUrl = "http://automationpractice.com/";
		driver.get(baseUrl + "/index.php");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		Thread.sleep(12000);
		AutomationHomePage.headerClass.home_SearchSection(driver).click();
		AutomationHomePage.headerClass.home_SearchSection(driver).clear();
		AutomationHomePage.headerClass.home_SearchSection(driver).sendKeys("dress");
		//gets the list of child elements (items in autosearch option)
		lst = driver.findElements(By.xpath("//body[@id='index']/div[2]/ul/child::li"));
	}
	
		/*Without using pageObjects
		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(3000);*/
	@Test
	public void displayContent()
	{
		for (WebElement element : lst) {
			System.out.println(element.getText());
			Reporter.log("Elements Displayed");
		}
	}
		
	@Test
	public void selectOption()
	{
		//loops through the child elements and selects the required option
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getText().contentEquals("T-shirts > Faded Short Sleeve T-shirts"))
			{
				lst.get(i).click();
				Reporter.log("T-shirts > Faded Short Sleeve T-shirts Selected");
				break;
			}
		}
	}
}
