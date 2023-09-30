package org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2 {
	
	WebDriver driver;
	
@BeforeClass
	private void beforeAllTc(){
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://www.bnstelecom.com.br/");
	driver.manage().window().maximize();
	}

@Test

private void tc1() throws InterruptedException {
	
	WebElement textEmail = driver.findElement(By.id("input_comp-ka7avp7n"));
		textEmail.sendKeys("Pushpa");
		WebElement txtPwd = driver.findElement(By.id("input_comp-ka7avp7w"));
		txtPwd.sendKeys("123456");
	
		WebElement btLogin = driver.findElement(By.xpath("//button[@class='kuTaGy wixui-button zKbzSQ']"));
		btLogin.click();
}

}