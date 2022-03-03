import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiltersMobile extends Parent {
	public void filtersMobile() throws Exception {
		try {
			// Clicking on filter
			WebElement f = driver
					.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[2]/strong"));
			f.click();
			Thread.sleep(1000);

			// Clicking on size filter
			WebElement s = driver.findElement(
					By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/div[1]/div"));
			s.click();
			Thread.sleep(2000);

			// Clicking on size
			WebElement s1 = driver.findElement(By.xpath(
					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/a[3]/div"));
			s1.click();
			Thread.sleep(3000);

			// Clicking on color filter
			WebElement c = driver.findElement(By.xpath(
					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div/span[1]"));
			c.click();
			Thread.sleep(2000);

			// Clicking on color
			WebElement c1 = driver.findElement(By.xpath(
					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[2]/ol/li[1]/a"));
			c1.click();
			Thread.sleep(3000);

			// Clicking on apply filters
			driver.findElement(By.className("apply-filter-btn")).click();
			Thread.sleep(1000);

			System.out.println("Filters for mob,Pass");

			// Write Report
			wr.writeReport("Filters for Mob,Passed");

			
		} catch (Exception e) {
			System.out.println("Unsuccessful filters");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Filters for Mob,Failed");
			wr.writeReport("**********");
		}
	}
}
