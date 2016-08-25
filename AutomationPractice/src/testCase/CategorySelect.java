package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.SelectandCheckOutAction;
import Actions.VerifyShoppingCart;
import pageObjects.AutomationHomePage;
import pageObjects.Home_Page;

public class CategorySelect extends SelectandCheckOutAction
{
 WebDriver driver = new FirefoxDriver();
 WebDriverWait wait=new WebDriverWait(driver, 5);
 Logger log = Logger.getLogger("CategorySelect");
 @BeforeClass(alwaysRun = true)
 public void setUp() throws Exception {
	 
	 log.info("openening the website");
	 driver.get("http://automationpractice.com/index.php?");
	 wait.until(ExpectedConditions.titleContains("My Store"));
	 Thread.sleep(12000);
	 }
 @Test
 public void selectitem() throws Exception
 {
	 log.info("on home page click on womens section");
	 //Select womens Section
	 AutomationHomePage.headerClass.home_WomenSection(driver).click();
	 Thread.sleep(3000);
	 log.info("womens section selected");
	 
	 //Expand the Tshirt section
	 log.debug("expand the Tshirt section");
	 driver.findElement(By.xpath(".//*[@id='categories_block_left']/div/ul/li[1]/span")).click();
	 Thread.sleep(3000);
	 
	 //Select option "Blouses"
	 log.debug("select option blouses");
	 driver.findElement(By.xpath(".//*[@id='categories_block_left']/div/ul/li[1]/ul/li[2]/a")).click();
	 Thread.sleep(3000);
	 
	 //Select size "Medium"
	 log.debug("select size 'Medium'");
	 driver.findElement(By.xpath(".//*[@id='layered_id_attribute_group_2']")).click();
	 
	 //Select color "Black"
	 log.debug("Select color 'Black'");
	 driver.findElement(By.xpath(".//*[@id='layered_id_attribute_group_11']")).click();
	 
	 //Check for availability
	 log.debug("Select color Check for availability");
	 driver.findElement(By.id("layered_quantity_1")).click();
	 
	 //Set the range of Jquery Slider to prefered offset
	 log.debug("Set the range of Jquery Slider to prefered offset");
	 WebElement w1=driver.findElement(By.xpath(".//*[@id='layered_price_slider']/a[1]"));
	 Actions act=new Actions(driver);
	 act.clickAndHold(w1).moveByOffset(100, 4).release().perform();
	 //print the price range selected
	 log.debug("print and report the price range selected");
	 System.out.println(driver.findElement(By.id("layered_price_range")).getText());
	 Reporter.log(driver.findElement(By.id("layered_price_range")).getText());
	 Thread.sleep(7000);
	 SelectandCheckOutAction.Execute(driver);
	 Thread.sleep(5000);
	 VerifyShoppingCart.Execute(driver);
	 Thread.sleep(4000);
	 Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]"))!=null);
	 Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText().matches("1"));
	 System.out.println(("Item Added to Cart" + driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText())); 
}
 @AfterClass
 public void teardown()
 {
	 driver.quit();
 }

}

 
