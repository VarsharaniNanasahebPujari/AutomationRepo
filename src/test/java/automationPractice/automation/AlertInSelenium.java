package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class AlertInSelenium {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	/*public void getAlert() throws InterruptedException
	{
		driver.get("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.id("alertButton"));
		//System.out.println(clickme.getText());
		clickme.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
	
		driver.close();
	}
	 public void getConfirmButton()
	 {
		 driver.get("https://demoqa.com/alerts");
		 WebElement confirm=driver.findElement(By.id("confirmButton"));
		 confirm.click();
		 
		 Alert alt1=driver.switchTo().alert();
		 System.out.println(alt1.getText());
		 alt1.dismiss();
		 driver.close();
		 
		 
		 
	 }*/
	 public void getpromptButton()
	 {
		 driver.get("https://demoqa.com/alerts");
		 WebElement prompt=driver.findElement(By.id("promtButton"));
		 prompt.click();
		 Alert alt2=driver.switchTo().alert();
		 System.out.println(alt2.getText());
		 alt2.sendKeys("varsharani");
		 alt2.accept();
		 driver.close();
		 
		 
		 
		 
	 }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 AlertInSelenium a=new  AlertInSelenium ();
		 a.setup();
		 //a.getAlert();
		// a.getConfirmButton();
		 a.getpromptButton();

	}

}
