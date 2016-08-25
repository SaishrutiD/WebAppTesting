package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartPage {
	
	private static WebElement element = null;

	//Use this if only 1 item is present while selecting from any section.
	public static WebElement AddToCart(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
		return element;
		}
	//Use this when there are multiple items while selecting an item from any section. Number in the arguments tells which item to be selected from the avaialable. i.e, 1 for 1st item, 2 for 2nd item present
	public static WebElement AddToCart(WebDriver driver, Integer number) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[" + number + "]/div/div[2]/div[2]/a[1]/span"));
		return element;
		}
	public static WebElement CartPopUp(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
		return element;
		}
}
//