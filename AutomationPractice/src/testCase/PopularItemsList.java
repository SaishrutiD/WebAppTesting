package testCase;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import pageObjects.Home_Page;

public class PopularItemsList {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?utm_campaign");
		Thread.sleep(4000);
		Home_Page.home_PopularSection(driver).click();
		LinkedList<WebElement> lst= new LinkedList<WebElement>(Home_Page.Popular.home_PopularItems(driver).findElements(By.xpath("//div[@class='product-container']"))) ;
		for (WebElement w : lst) {
			Reporter.log(w.getText());
			System.out.println(w.getText());
		}
		

	}

}
