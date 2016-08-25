package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.AutomationHomePage;
import pageObjects.ContactUsPage;

public class contactUsAction {
	

	 public static void Execute(WebDriver driver) throws Exception
	 {
		 AutomationHomePage.headerClass.home_ContactUS(driver).click();
		 Thread.sleep(3000);
		 
		 Select s1=new Select(ContactUsPage.SubjectHeading(driver));
		 s1.selectByVisibleText("Webmaster");
		 ContactUsPage.Email(driver).sendKeys("abc@gmail.com");
		 ContactUsPage.OrderReference(driver).sendKeys("123");
		 ContactUsPage.Message(driver).sendKeys("ksjdfhs");
		 ContactUsPage.submitMessage(driver).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isEnabled(), "Test passed yuuu");
}
}

