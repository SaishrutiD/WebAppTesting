package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement home_PopularSection(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[1]/a"));
		return element;
		
	}
	
	public static WebElement home_BestSellersSection(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[2]/a"));
		return element;
		
	}
	
	
	public static class Popular{
		
		private static WebElement element = null;
		
		public static WebElement home_PopularItems(WebDriver driver)
		{
			element = driver.findElement(By.id("homefeatured"));
			return element;
			
		}
		
		public static WebElement home_BestSellersItems(WebDriver driver)
		{
			element = driver.findElement(By.id("blockbestsellers"));
			return element;
			
		}
	}
	
	public static class homepage_slider
	{
		private static WebElement element = null;
		
		public static WebElement home_slidercontainer(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//li[@class='homeslider-container']"));
			return element;
			
		}
		
		public static WebElement home_shopNow(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			return element;
			
		}
		
		public static WebElement slide_next(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//a[@class='bx-next']"));
			return element;
		}
		
		public static WebElement slide_prev(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//a[@class='bx-prev']"));
			return element;
		}
		
	}
	
}
