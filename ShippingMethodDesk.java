import org.openqa.selenium.By;

public class ShippingMethodDesk extends Parent {
	public void shipping_method() throws Exception {
		try {
			// Scrolling Down
			js.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(2000);

			// Clicking on shipping method
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[2]/div/div[3]/form/div[2]/table/tbody/tr[2]/td[2]"))
					.click();
			Thread.sleep(3000);

			// Scrolling Down
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(2000);
			
			System.out.println("Shipping method for desk,Pass");
			
			wr.writeReport("Shipping Method for Desk ,Passed");
		} catch (Exception e) {
			System.out.println("Shipping method for desk, Fail");
			driver.quit();
			Thread.sleep(1000);
			
			//ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			
			//Writing Report
			wr.writeReport("Shipping method for desk ,Failed");
			wr.writeReport("******");
		}
	}
}
