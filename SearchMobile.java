import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchMobile extends Parent {
	public void searchMobile() throws Exception {
		try {
			// Clicking on search bar
			WebElement vr = driver
					.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[2]/div/div[2]/form/div[1]/label"));
			vr.click();

			// Entering heels in search bar
			WebElement a = driver.findElement(By.name("q"));
			a.sendKeys("heels");
			Thread.sleep(3000);

			// Press ENTER
			a.sendKeys(Keys.RETURN);
			Thread.sleep(3000);

			System.out.println("Search for mob,Pass");

			// Write Report
			wr.writeReport("Search for mob,Passed");
			
		} catch (Exception e) {
			System.out.println("Search for mobile,Fail");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Search for mob,Failed");
			wr.writeReport("******");
		}
	}
}
