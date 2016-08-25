package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {
	
	private static WebElement element = null;

	public static WebElement AddressHEading(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/h1"));
		return element;
		}
	public static WebElement ChooseAddress(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#id_address_delivery"));
		return element;
		}
	public static WebElement SelectBillingAddress(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#addressesAreEquals"));
		return element;
		}
	public static WebElement UpdateDeliverAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/div/div[1]/div[1]/div/div/select"));
		return element;
		}
	public static WebElement UpdateBillingAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/div/div[2]/div[2]/ul/li[7]/a/span"));
		return element;
		}
	public static WebElement ProceedToCheckOut(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/p/button"));
		return element;
		}
	public static WebElement TextMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/div/div[3]/textarea"));
		return element;
		}
}

//
