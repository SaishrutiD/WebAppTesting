package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.PaymentMethodPage;

public class PaymentAction {

	public static void Execute(WebDriver driver) throws Exception
	{
		Assert.assertEquals(PaymentMethodPage.Heading(driver).getText(), "PLEASE CHOOSE YOUR PAYMENT METHOD");
		PaymentMethodPage.PayByCheck(driver).click();
		Reporter.log("Payment page verify and proceed successful");
	}
}
