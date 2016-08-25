package Actions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjects.LoginPage;

public class SignInAction {
	public static void Execute(WebDriver driver, String Uname, String Passwd)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Login - My Store"));
		LoginPage.SignInemail(driver).sendKeys(Uname);
		LoginPage.SignInpasswd(driver).sendKeys(Passwd);
		LoginPage.SubmitLogin(driver).click();
		Assert.assertTrue(driver.getTitle().matches("Order - My Store"));
		//assertEquals("AUTHENTICATION", driver.findElement(By.xpath(".//*[@id='login_form']/h3")).getText());
	}

}
