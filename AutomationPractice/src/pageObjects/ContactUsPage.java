package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

private static WebElement element = null;
	
	public static WebElement SubjectHeading(WebDriver driver) {
		element = driver.findElement(By.id("id_contact"));
		return element;
		}
	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
		}
	public static WebElement OrderReference(WebDriver driver) {
		element = driver.findElement(By.id("id_order"));
		return element;
		}
	public static WebElement Message(WebDriver driver) {
		element = driver.findElement(By.id("message"));
		return element;
		}
	public static WebElement submitMessage(WebDriver driver) {
		element = driver.findElement(By.id("submitMessage"));
		return element;
		}
	
	
	
}
