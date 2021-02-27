import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		// calender 
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/a[1]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//drop down
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
	/*	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enable");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.ass
		}
		*/
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
