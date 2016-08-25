package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.AddtoCartPage;

public class SelectandCheckOutAction extends AddtoCartPage {

	
	public static void Execute(WebDriver driver) throws Exception
	{
		 Logger log = Logger.getLogger("devpinoyLogger");
		/*WebElement w2=AddtoCartPage.AddToCart(driver);
		Thread.sleep(3000);
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", w2);*/
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, 8); 
		 wait.until(ExpectedConditions.elementToBeClickable(AddtoCartPage.AddToCart(driver)));
		 //wait.until(ExpectedConditions.presenceOfElementLocated((By) AddtoCartPage.AddToCart(driver)));
		 AddtoCartPage.AddToCart(driver).click();
		 System.out.println("got the cart");
	    Thread.sleep(4000);
	    log.debug("Click on proceed to checkout");
	    AddtoCartPage.CartPopUp(driver).click();
	    Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]"))!=null);
	    Reporter.log("Item Added to Cart" + driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText());
	  }
	
	public static void Execute(WebDriver driver, Integer num) throws Exception
	{
		 Logger log = Logger.getLogger("devpinoyLogger");
		/*WebElement w2=AddtoCartPage.AddToCart(driver);
		Thread.sleep(3000);
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", w2);*/
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, 16); 
		 //wait.until(ExpectedConditions.elementToBeClickable(AddtoCartPage.AddToCart(driver, num)));
		 wait.until(ExpectedConditions.visibilityOf(AddtoCartPage.AddToCart(driver, num)));
		 //wait.until(ExpectedConditions.presenceOfElementLocated((By) AddtoCartPage.AddToCart(driver)));
		 AddtoCartPage.AddToCart(driver, num).click();
		 System.out.println("got the cart");
	    Thread.sleep(4000);
	    log.debug("Click on proceed to checkout");
	    AddtoCartPage.CartPopUp(driver).click();
	    Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]"))!=null);
	    Reporter.log("Item Added to Cart" + driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText());
	  }
	}

