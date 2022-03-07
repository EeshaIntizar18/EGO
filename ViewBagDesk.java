import org.openqa.selenium.By;

public class ViewBagDesk extends Parent {
	public void viewBagDesk() throws Exception {
		try {
			// Clicking on view bag button
			driver.findElement(By.className("view")).click();
			Thread.sleep(4000);

			// Scrolling Down
			js.executeScript("window.scrollBy(0,50)", "");
			Thread.sleep(3000);

			// Clicking on quantity
			driver.findElement(By.xpath(
					"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select"))
					.click();
			Thread.sleep(2000);

			// Changing Quantity
			driver.findElement(By.xpath(
					"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[2]"))
					.click();
			Thread.sleep(2500);

			// Clicking on checkout button
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[3]/div[4]/ul/li[1]/button")).click();
			Thread.sleep(2500);
			System.out.println("View bag for desk,Pass");
			wr.writeReport("View Bag for Desk,Passed");

		} catch (Exception e) {
			System.out.println("View Bag for Desk,Fail");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Writing Report
			wr.writeReport("View Bag for Desk ,Failed");
			wr.writeReport("******");
		}
	}
}
