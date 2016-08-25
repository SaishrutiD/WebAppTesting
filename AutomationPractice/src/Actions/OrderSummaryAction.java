package Actions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import pageObjects.OrderSummaryPage;

public class OrderSummaryAction {
	public static void Execute(WebDriver driver)
	{
		assertEquals("ORDER SUMMARY", OrderSummaryPage.Heading(driver).getText());
		OrderSummaryPage.ConfirmOrder(driver).click();
	}
	

}
