import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities ch=		DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.acceptInsecureCerts();
		ChromeOptions c=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","");
		c.merge(ch);
	
	}

}
 