package testCase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.junit.AfterClass;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.AutomationHomePage;





import org.apache.log4j.Logger;

import Actions.SelectandCheckOutAction;

public class TestCart {
  private WebDriver driver;
  Logger log = Logger.getLogger("devpinoyLogger");
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @Test
  public void SelectDress() throws Exception {
    driver.get("http://automationpractice.com/index.php?");
    log.debug("Opening the Website");
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    log.debug("Providing implicit wait time of 12 seconds for the application to launch");
    Actions act=new Actions(driver);
    Thread.sleep(4000);
	WebElement w1=AutomationHomePage.headerClass.home_WomenSection(driver);
	Thread.sleep(2000);
	act.moveToElement(w1).perform();
	Thread.sleep(2000);
    driver.findElement(By.linkText("T-shirts")).click();
    log.debug("Move to women sections >> click on T-shirts link");
    Thread.sleep(5000);
    
    /*Selects the hidden element "Add to cart"
    WebElement w2=driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", w2);*/
    log.debug("Select the first item and Click on add to cart");
    SelectandCheckOutAction.Execute(driver);
  }
  
  @AfterTest
  public void teardown()
  {
 	 driver.quit();
  }

}


