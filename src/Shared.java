import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared { 
	ChromeDriver dr;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aapon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		}
	public void closeBroser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}
	public void myGet(String url) {
		dr.get(url);
	}
	public void verifyPageTitle() {
		String s = dr.getTitle();
		System.out.println(s);
	}
	public void verifyPageUrl() {
		dr.getCurrentUrl();
		System.out.println(dr.getCurrentUrl());
	}
	public void clickElement(By locator) {
		dr.findElement(locator).click();
	}
	public void type(WebElement element, String value) {
		element.sendKeys(value);
	}
	public void varifyElementDisplay(By locator) {
		dr.findElement(locator).isDisplayed();
		System.out.println("Is element displayed :" + dr.findElement(locator).isDisplayed());
	}

}
