package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSummaryPage {

	private static WebElement element = null;

	public static WebElement Heading(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/h1"));
		return element;
		}
	public static WebElement PaymentType(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/div/h3"));
		return element;
		}
	public static WebElement ConfirmOrder(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/p/button"));
		return element;
		}
}


//