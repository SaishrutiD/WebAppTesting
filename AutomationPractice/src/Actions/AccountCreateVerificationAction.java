package Actions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageObjects.OrderConfirmationPage;

public class AccountCreateVerificationAction {
	public static void Execute(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")), "Sign out"));
		assertEquals("Sign out", driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).getText());
	}
}
/*
if(driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).getText().equalsIgnoreCase("Sign out"))
Reporter.log("Succesfully created account");
else
Reporter.log("incorrect inputs");

}
*/