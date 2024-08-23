package automationPractice.automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebTableInSelenium {

WebDriver driver;		//class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebTableInSelenium w=new WebTableInSelenium();
		w.setup();
		w.getTableData();
	}
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getTableData()
	{
		driver.get("https://demo.guru99.com/test/web-table-element.php");
				
		List<WebElement> table_row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(table_row.size());
		
		for(WebElement x:table_row)
		{
			//System.out.println(x.getText());
			
			String company_name=x.findElement(By.xpath("td[1]")).getText();
			String current_price=x.findElement(By.xpath("td[3]")).getText();
			
			if(company_name.contains("Ltd"))
			{
				System.out.println(company_name+":"+current_price);
			}
		}
		
	}


}
