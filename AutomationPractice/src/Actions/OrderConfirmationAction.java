package Actions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.OrderConfirmationPage;

public class OrderConfirmationAction 
{
	public static void Execute(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBePresentInElement(OrderConfirmationPage.PageHeading(driver), "ORDER CONFIRMATION"));
		assertEquals("ORDER CONFIRMATION", OrderConfirmationPage.PageHeading(driver).getText());
	}

}
