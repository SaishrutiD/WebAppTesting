package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	private static WebElement element = null;
	
	public static WebElement emailCreate(WebDriver driver) {
		element = driver.findElement(By.id("email_create"));
		return element;
		}
	public static WebElement SubmitCreate(WebDriver driver) {
		element = driver.findElement(By.id("SubmitCreate"));
		return element;
		}
	public static WebElement SignInemail(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
		}
	public static WebElement SignInpasswd(WebDriver driver) {
		element = driver.findElement(By.id("passwd"));
		return element;
		}
	public static WebElement SubmitLogin(WebDriver driver) {
		element = driver.findElement(By.id("SubmitLogin"));
		return element;
		}

}
