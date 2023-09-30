package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	public static WebDriver driver;
	public static Alert a;
	public static JavascriptExecutor js;
	
	
	public static void openchrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
			
	public static void closeBrowser() {
		
		driver.quit();
		
	}
	
	public static void fetchUrl() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	public static void fetchTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
			
	}
	
	public static void getAttribute(WebElement ele, String name) {
		
		String txt = ele.getAttribute(name);
		System.out.println(txt);
	}
	
	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);
			
	}
	
	public static void acceptAlert() {
		
		a = driver.switchTo().alert();
		
	}
	
	public static void alertSendkeys(String val) {
		a = driver.switchTo().alert();
		a.sendKeys(val);
	}
	
	public static void getTextAlert() {
		a = driver.switchTo().alert();
		String txt = a.getText();
		System.out.println(txt);
		a.accept();
		
	}
	
public static void cancelAlert() {
		
		driver.switchTo().alert().dismiss();
		
	}

public static void scrollDown(WebElement element){
js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true)", element);

}

public static void scrollUp(WebElement element){
js = (JavascriptExecutor) driver;
js.executeAsyncScript("arguments[0].scrollIntoView(false)", element);

}
	
	}
