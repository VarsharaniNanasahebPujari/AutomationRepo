package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	WebDriver driver;
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
	
		
		
	}
public void getDatePicker()throws InterruptedException {
	//driver.get("https://demoqa.com/date-picker");
	WebElement calender=driver.findElement(By.id("datePickerMonthYearInput"));
	calender.click();

	
	WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
	Select Syear=new Select(year);
	Thread.sleep(3000);
	Syear.selectByValue("1993");
	
	WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
	Select selmon=new Select(month);
	selmon.selectByVisibleText("January");
	
	
	WebElement day=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--027']"));
	day.click();
	
	
}
/*public void getTimeDate()
{
	WebElement DateTime=driver.findElement(By.id("dateAndTimePickerInput"));
	DateTime.click();
	
	WebElement year=driver.findElement(By.xpath("//span[contains(text(),'2017')]"));
	year.click();
	
	WebElement month=driver.findElement(By.className(""));
	month.click();
	
	WebElement day=driver.findElement(By.className("react-datepicker__day react-datepicker__day--027"));
	day.click();
	
	
			}*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DatePicker d=new DatePicker();
		d.setup();
		d.getDatePicker();
		//d.getTimeDate();

	}

}
