package automationPractice.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureErrorMessage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		
		WebElement Error_msg=driver.findElement(By.className("_9ay7"));
		System.out.println(Error_msg.getText());
		
		
		
		

	}

}
