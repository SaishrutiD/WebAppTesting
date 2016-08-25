package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount_PersonalInfoPage {
	
private static WebElement element = null;

public static class PersonalInfo{
	public static WebElement Title_Mr(WebDriver driver) {
		element = driver.findElement(By.id("id_gender1"));
		return element;
		}
	public static WebElement Title_Mrs(WebDriver driver) {
		element = driver.findElement(By.id("id_gender2"));
		return element;
		}
	public static WebElement FirstName(WebDriver driver) {
		element = driver.findElement(By.id("customer_firstname"));
		return element;
		}
	public static WebElement LastName(WebDriver driver) {
		element = driver.findElement(By.id("customer_lastname"));
		return element;
		}
	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
		}
	public static WebElement Password(WebDriver driver) {
		element = driver.findElement(By.id("passwd"));
		return element;
		}
	public static WebElement DOB_date(WebDriver driver) {
		element = driver.findElement(By.id("days"));
		return element;
		}
	public static WebElement DOB_month(WebDriver driver) {
		element = driver.findElement(By.id("months"));
		return element;
		}
	public static WebElement DOB_year(WebDriver driver) {
		element = driver.findElement(By.id("years"));
		return element;
}
}

public static class AddressInfo{

	public static WebElement AddressLine(WebDriver driver) {
		element = driver.findElement(By.id("address1"));
		return element;
		}
	public static WebElement City(WebDriver driver) {
		element = driver.findElement(By.id("city"));
		return element;
		}
	public static WebElement State(WebDriver driver) {
		element = driver.findElement(By.id("id_state"));
		return element;
		}
	public static WebElement Postalcode(WebDriver driver) {
		element = driver.findElement(By.id("postcode"));
		return element;
		}
	public static WebElement Country(WebDriver driver) {
		element = driver.findElement(By.id("id_country"));
		return element;
		}
	public static WebElement MobileNumber(WebDriver driver) {
		element = driver.findElement(By.id("phone_mobile"));
		return element;
		}
	public static WebElement AddressAlias(WebDriver driver) {
		element = driver.findElement(By.id("alias"));
		return element;
		}
	public static WebElement SubmitButton(WebDriver driver) {
		element = driver.findElement(By.id("submitAccount"));
		return element;
		}
}
}
