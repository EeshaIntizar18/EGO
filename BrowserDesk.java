import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDesk extends Parent {
	public static void openBrowser() throws IOException, InterruptedException, Exception {

		// Setting property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/home/rlt/Downloads/chromedriver");

		// Instance of ChromeOption
		ChromeOptions options = new ChromeOptions();

		// Disable notification PopUp
		options.addArguments("--disable-notifications");

		// Instance of ChromeDriver.
		driver = new ChromeDriver(options);

		// Calling Ego HomePage
		driver.get("https://ego.co.uk");
		Thread.sleep(1000);

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4500);
			
	}
}