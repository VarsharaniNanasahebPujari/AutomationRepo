package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;


public class Action_Drag_Drop {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    
	}
	public void dragAndDrop() throws InterruptedException
	{
		WebElement btn_drag=driver.findElement(By.id("fourth"));
		WebElement btn_drop=driver.findElement(By.id("amt7"));
		Actions act=new Actions(driver);
		act.dragAndDrop(btn_drag,btn_drop).build().perform();
		
		Thread.sleep(3000);
		WebElement btn_drop1=driver.findElement(By.id("amt8"));
		act.dragAndDrop(btn_drag,btn_drop1).build().perform();
		
		
		WebElement entry_debit=driver.findElement(By.id("t7"));
		
		System.out.println("amount debited:"+ entry_debit.getText());
		
	}
	

	public static void main(String[] args)throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Action_Drag_Drop dd=new Action_Drag_Drop();
		dd.setup();
		dd.dragAndDrop();

	}

}
