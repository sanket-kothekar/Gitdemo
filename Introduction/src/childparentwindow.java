import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childparentwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Set<String>ids=driver.getWindowHandles();//all window get store as it is set
		Iterator<String>it=ids.iterator(); //iteration throught
        String parentid=it.next();
        String childid=it.next();
       System.out.println( driver.switchTo().window(childid).getTitle());

	}

}
