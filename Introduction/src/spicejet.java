import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;
//parent child relation

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		/*
		 * drop down
		   driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		   Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	       s.selectByValue("4");
		
	
		*/
		//check box
		Assert.assertFalse( driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

	//	System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
	   
	
		
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	     driver.findElement(By.xpath("//a[@text='Ajmer (KQH)']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();//parent child relation
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")).click();//c alender click
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();//date click
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/a[1]")).click();
	}

}
 