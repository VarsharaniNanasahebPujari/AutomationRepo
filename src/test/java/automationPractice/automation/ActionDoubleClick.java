package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class ActionDoubleClick {
	WebDriver driver;
	
	public void setup()
	{
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
	public void Action_DoubleClick() 
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement btn_doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act=new Actions(driver);
		act.doubleClick(btn_doubleclick).build().perform();
		
		
	}
     public void alert_handle12()throws InterruptedException
     {
    	 Alert alt=driver.switchTo().alert();
    	 
    	 System.out.println(alt.getText());
    	 Thread.sleep(3000);
    	 alt.accept();
    	 driver.close();
    	 
     }
	public static void main(String[] args)throws InterruptedException
{
		// TODO Auto-generated method stub
		ActionDoubleClick a=new ActionDoubleClick();
		a.setup();
		a.Action_DoubleClick();
		a.alert_handle12();

	}

}
