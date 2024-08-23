package automationPractice.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectClass {
	WebDriver driver;
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	}
	
	public void getDropDown()throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement selectcountry=driver.findElement(By.name("country"));
		
		Select s=new Select(selectcountry);
		s.selectByIndex(0);
		
		s.selectByValue("INDIA");
	  
		s.selectByVisibleText("ANGOLA");
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement sel_cars=driver.findElement(By.id("cars"));
		
		Select sc=new Select(sel_cars);
		System.out.println(sc.isMultiple());
		sc.selectByIndex(1);
		sc.selectByVisibleText("Opel");
		sc.selectByValue("audi");
		sc.selectByIndex(0);
		
		
		
		sc.deselectByValue("opel");
		sc.deselectByIndex(1);
		sc.deselectAll();
		
		
		
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		DropDownSelectClass ds=new DropDownSelectClass();
		ds.setup();
		ds.getDropDown();

	}

}
