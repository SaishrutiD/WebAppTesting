package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.AddressPage;

public class VerifyAddressProceed {
	
	public static void Execute(WebDriver driver) throws Exception
	{
		Assert.assertEquals(AddressPage.AddressHEading(driver).getText(), "ADDRESSES");
		AddressPage.TextMessage(driver).sendKeys("some message");
		AddressPage.ProceedToCheckOut(driver).click();
		Reporter.log("Address page verify and proceed successful");
	}

}
