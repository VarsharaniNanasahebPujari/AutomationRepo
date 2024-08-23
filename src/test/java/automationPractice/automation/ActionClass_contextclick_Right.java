package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;


public class ActionClass_contextclick_Right {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	public void contextClick()
	
	{
		
		WebElement button_right=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act=new Actions(driver);
	     act.contextClick(button_right).build().perform();
	     
	     
	     
		
	}
	public void clickOnSubMenu()
	{
		WebElement edit_button=driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
		edit_button.click();
		

				
	}
	 public void alert_handle()throws InterruptedException
	 {
		 Alert a=driver.switchTo().alert();
		 System.out.println(a.getText());
		 Thread.sleep(3000);
		 a.accept();
		 driver.close();
		 
		 
		 
	 }
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ActionClass_contextclick_Right a=new ActionClass_contextclick_Right();
		a.setup();
		a.contextClick();
		a.clickOnSubMenu();
		a.alert_handle();
		
		

	}
	
}
