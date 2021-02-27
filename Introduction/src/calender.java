//import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
       
	   driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
	   driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]")).click();
	   /*

	   
	   while(!driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText().contains("April"))
	   {
		   driver.findElement(By.xpath(""))
	   }
	   
	   */
       List<WebElement> dates = driver.findElements(By.cssSelector("div.dateInnerCell"));
       
       for(int i=0;i<driver.findElements(By.cssSelector("div.dateInnerCell")).size();i++)
       {
    	   String name=driver.findElements(By.cssSelector("div.dateInnerCell")).get(i).getText();
    	   
    	   if(name.equalsIgnoreCase("24"))
    	   {
    		   driver.findElements(By.cssSelector("div.dateInnerCell")).get(i).click();
    		   break;
    	   }
       }
       
        
  
      


	}

}
