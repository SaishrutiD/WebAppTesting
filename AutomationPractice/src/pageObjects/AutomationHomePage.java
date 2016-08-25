package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationHomePage {
	
	public static class headerClass{
	private static WebElement element = null;

	public static WebElement home_WomenSection(WebDriver driver) {

		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));

		return element;

	}

	public static WebElement home_DressesSection(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));

		return element;

	}
	
	public static WebElement home_TshirtsSection(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));

		return element;

	}
	
	public static WebElement home_SearchSection(WebDriver driver) {

		element = driver.findElement(By.id("search_query_top"));

		return element;

	}
	
	public static WebElement home_SeacrhButtonClick(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//button[@class='btn btn-default button-search']"));
		return element;
		
	}
	
	public static WebElement home_cartSection(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
		return element;
		
	}
	
	public static WebElement home_ContactUS(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
		return element;
		
	}
	
	public static WebElement home_SignIn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		return element;
		
	}
	
	public static WebElement home_Sale(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[1]/div/div/a/img"));
		return element;
		
	}
	
	public static WebElement home_SignOut(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
		return element;
	}
	
}

	
}
