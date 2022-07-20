package openChromium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//This test class have the purpose to launch Chromium and navigate to www.google.com
public class OpenChromiumTest {
	public static void main(String[] args) {
	      WebDriver driver = (WebDriver) new ChromeDriver();
	      
	      System.setProperty("webdriver.chrome.driver",
	      "C:\\Users\\HP\\Documents\\CD\\chromedriver.exe");
	      String url = "www.google.com";
	      driver.get(url);
	   }
}
