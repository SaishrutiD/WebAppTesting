package testCase;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.SelectandCheckOutAction;
import Actions.SignInAction;
import Actions.VerifyAddressProceed;
import Actions.VerifyShippingAddress;
import Actions.VerifyShoppingCart;
import pageObjects.AutomationHomePage;
import pageObjects.Home_Page;

public class FullFlowModule {
	
	WebDriver driver=new FirefoxDriver();
	WebDriverWait wait=new WebDriverWait(driver, 14);
	
@BeforeClass
public void SetUp()
{
	driver.get("http://automationpractice.com");
	wait.until(ExpectedConditions.titleContains("My Store"));
	AutomationHomePage.headerClass.home_DressesSection(driver).click();
	}

@Test
public void selectDress() throws Exception
{
	LinkedList<WebElement> lst= new LinkedList<WebElement>(driver.findElements(By.xpath(".//*[@id='center_column']/ul/li"))) ;
	//System.out.println(lst.get(0).getText());
	boolean test = true;
	for(int i=0;i<lst.size() && test;i++)
	{
		System.out.println(lst.get(i).getText());
		if(lst.get(i).getText().contains("Printed Chiffon Dress"))
		{
			System.out.println(lst.get(i).getText());
			Actions act=new Actions(driver);
			Thread.sleep(4000);
			act.moveToElement(lst.get(i)).perform();
			Reporter.log("Printed Chiffon Dress Selected");
			test = false;
			SelectandCheckOutAction.Execute(driver, (i+1));
			
		}
	}
	
	System.out.println("no action came out of for loop");
	VerifyShoppingCart.Execute(driver);
	SignInAction.Execute(driver, "sai.shruti17.d@gmail.com", "12345");
	VerifyAddressProceed.Execute(driver);
	VerifyShippingAddress.Execute(driver);
}
	
}

