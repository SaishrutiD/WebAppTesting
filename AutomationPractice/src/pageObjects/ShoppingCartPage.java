package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
	
	private static WebElement element = null;

	public static WebElement UnitPrice(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".price"));
		return element;
		}
	public static WebElement TotalProducts(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#total_product"));
		return element;
		}
	public static WebElement TotalPrice(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#total_price"));
		return element;
		}
	public static WebElement ProceedToCheckOut(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		return element;
		}
	public static WebElement heading(WebDriver driver) {
		element = driver.findElement(By.id("cart_title"));
		return element;
		}

}
//