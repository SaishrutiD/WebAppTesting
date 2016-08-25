package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.ShippingPage;

public class VerifyShippingAddress {
	public static void Execute(WebDriver driver) throws Exception
	{
		Assert.assertEquals(ShippingPage.ShippingHeading(driver).getText(), "SHIPPING");
		ShippingPage.TermOfServiceRadioButton(driver).click();
		Reporter.log("Shipping Address page verify and proceed successful");
	}

}
