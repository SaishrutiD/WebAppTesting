package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.OrderSummaryPage;
import pageObjects.PaymentMethodPage;
import pageObjects.ShoppingCartPage;

public class VerifyShoppingCart {

	public static void Execute(WebDriver driver) throws Exception
	{
	
		Assert.assertEquals(ShoppingCartPage.heading(driver).getText(), "SHOPPING-CART SUMMARY\n" +
                "Your shopping cart contains: 1 Product");
		Reporter.log(ShoppingCartPage.TotalPrice(driver).getText());
		
		ShoppingCartPage.ProceedToCheckOut(driver).click();
	}
}
