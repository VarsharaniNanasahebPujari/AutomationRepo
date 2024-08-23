package automationPractice.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement txt_Email_phone=driver.findElement(By.id("email"));
		txt_Email_phone.sendKeys("varsharani.pujari27@outlook.com");
		
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("Siddharth");
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorsInSelenium loc=new LocatorsInSelenium();
		loc.setup();

	}

}
