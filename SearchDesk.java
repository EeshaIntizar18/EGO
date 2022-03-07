import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchDesk extends Parent {
	public void search() throws Exception {
		try {
			// Entering heels in search bar
			Thread.sleep(1000);
			WebElement ar = driver.findElement(By.name("q"));
			ar.sendKeys("heels");
			Thread.sleep(3000);

			// Press ENTER
			ar.sendKeys(Keys.RETURN);
			Thread.sleep(3000);

			System.out.println("Search for desk,Pass");

			// Write Report
			wr.writeReport("Search for desk ,Passed");

		} catch (Exception e) {
			System.out.println("Search for desk,Fail");
			driver.quit();
			Thread.sleep(1000);
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Search for Desk ,Failed");
			wr.writeReport("**********");
		}
	}
}
