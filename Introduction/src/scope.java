import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size()) ;
		WebElement columndriver=footer.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		//click on each link and if there are working

		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000L);
		}
		
			Set<String> abc=driver.getWindowHandles();//all window get store as it is set
			Iterator<String> it=abc.iterator(); //iteration throught
			
		  while(it.hasNext())
		  {
			  driver.switchTo().window(it.next());
			  System.out.println(driver.getTitle());
		  } 
			
		 
	}
	

}
