import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserMobile extends Parent {
	public static void openBrowserMobile() throws Exception {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Nexus 5");

		// Setting property
		System.setProperty("webdriver.chrome.driver", "/home/rlt/Downloads/chromedriver");

		// Instance of ChromeOption
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

		// Disable notification PopUp
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://ego.co.uk");

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4500);
		try {
			// Closing PopUp window
			driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();
			Thread.sleep(1000);

			System.out.println("Add closed for mob,Pass");

			// Write Report
			wr.writeReport("           ");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			wr.writeReport("****Test Case/Scenario****,Status,Time: " + time);
			wr.writeReport("Add closed for Mob,Passed");

		} catch (Exception e) {
			System.out.println("Add closed for mob,Fail");

			// Write Report
			wr.writeReport("           ");
			wr.writeReport("****Test Case/Scenario****,Status");
			wr.writeReport("Add closed for Mob,Failed");
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
		}
	}
}
