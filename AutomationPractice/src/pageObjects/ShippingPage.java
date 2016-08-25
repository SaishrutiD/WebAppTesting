package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage {

	private static WebElement element = null;

	public static WebElement ShippingHeading(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/h1"));
		return element;
		}
	public static WebElement TermOfServiceRadioButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		return element;
		}
	public static WebElement ProceedToCheckOut(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button"));
		return element;
		}
	
	public static WebElement Alert(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button"));
		return element;
		}
}


