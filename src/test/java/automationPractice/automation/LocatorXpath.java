package automationPractice.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Absolute Xpath
		
		//WebElement email_absolute=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		
		//email_absolute.sendKeys("varsha");//copy fullxpath
		
		/*WebElement pass_absolute=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		pass_absolute.sendKeys("w124555");*/
		
		
		//Relative xpath
		WebElement email_relative=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		email_relative.sendKeys("varsha");//copy relativexpath
		
		WebElement pass_relative=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pass_relative.sendKeys("w1245558909");

	}

}
