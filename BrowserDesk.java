import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
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
		try {
			// Closing PopUp window
			driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();
			Thread.sleep(1000);

			System.out.println("Add closed for desk,Pass");
			
			// Write Report
			wr.writeReport("           ");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			wr.writeReport("****Test Case/Scenario****,Status,Time: " + time);
			wr.writeReport("Add closed for Desk,Passed");
			
		} catch (Exception e) {
			System.out.println("Add closed for desk,Fail");
			driver.quit();

			// Write Report
			wr.writeReport("           ");
			wr.writeReport("****Test Case/Scenario****,Status");
			wr.writeReport("Add closed for Desk,Failed");
			wr.writeReport("******");

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
		}
	}
}