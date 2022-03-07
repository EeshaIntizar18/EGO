import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FiltersDesk extends Parent {
	public void filters() throws Exception {
		try {
			// Clicking on size filter
			WebElement f = driver.findElement(By.className("filter-options-title"));
			f.click();
			Thread.sleep(500);

			// Clicking on size 4
			WebElement no = driver.findElement(By.xpath(
					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/a[3]/div"));
			no.click();
			Thread.sleep(4000);

			// Clicking on color filter
			WebElement color1 = driver.findElement(
					By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div"));
			Thread.sleep(500);
			color1.click();

			// Clicking on black Color
			WebElement select = driver.findElement(By.className("layer-input-filter"));
			select.click();
			Thread.sleep(4000);

			// Scrolling down
			JavascriptExecutor is = (JavascriptExecutor) driver;
			is.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(2000);

			System.out.println("Filters for desk,Pass");
			// Write Report
			wr.writeReport("Filters for desk ,Passed");

			
		} catch (Exception e) {
			System.out.println("Unsucessful filters for Desk");
			Thread.sleep(1000);
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			driver.quit();
			// Write Report
			wr.writeReport("Filters for desk ,Failed");
			wr.writeReport("**********");
		}
	}
}
