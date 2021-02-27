import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// driver.switchTo().frame(1);  index method
		
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));//web element method
//         driver.findElement(By.cssSelector("#draggable")).click();
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.cssSelector("#draggable"));
        WebElement dest=driver.findElement(By.cssSelector("#droppable"));
        a.dragAndDrop(source, dest).build().perform();
        driver.switchTo().defaultContent();
        
        
	}

}
