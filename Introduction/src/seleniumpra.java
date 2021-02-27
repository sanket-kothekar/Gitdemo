
import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumpra {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String[] item= {"Cucumber","Brocolli","Beetroot"};
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	//   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// implicit time work whole program
	/*	WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("span.promoInfo")));
	*/
		
//	WebDriverWait w=new WebDriverWait(driver,5);


		
	//	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[3]/button[1]")).click();
		additem(driver,item);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("div.container div.products-wrapper:nth-child(2) div.products div:nth-child(4) div.promoWrapper:nth-child(1) > button.promoBtn:nth-child(2)")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]"));
		//driver.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText();
	
		
	 
	}


	 public static void additem(WebDriver driver,String[] item)
	 {
			List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name "));
			
			
			
			for(int i=0;i<product.size();i++)
			{
				String[] name=product.get(i).getText().split("-");
				String format=name[0].trim();
				
				
				List itemlist=Arrays.asList(item);
				int j=0;
				if(itemlist.contains(format))
				{
					//driver.findElement("//button[text()='ADD TO CART']");
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					
					j++;
					if(j==3)
					{
							break;
					}
					
				}
			}
			
			
			
	 }
}
