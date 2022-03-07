import org.openqa.selenium.By;

public class ShippingAddressGuestMob extends Parent {
	public void shipping_address_GuestMobile() throws Exception {
		try {
			// Enter email
			driver.findElement(By.id("customer-email")).sendKeys("usman.ali@rltsquare.com");
			Thread.sleep(1500);

			// Scroll down
			js.executeScript("window.scrollBy(0,200)", "");

			// Selecting country drop down
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[1]/div/select"))
					.click();

			// Selecting United kingdom
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[1]/div/select/option[234]"))
					.click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,50)", "");

			// Setting First name
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"))
					.sendKeys("Test");

			// Setting Last name
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input"))
					.sendKeys("Test");

			// Entering post code
			Thread.sleep(500);
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[4]/div/input"))
					.sendKeys("M32 0JT");
			Thread.sleep(250);
			js.executeScript("window.scrollBy(0,50)", "");

			// Entering address line one
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input"))
					.sendKeys("Unit A1, Thomas Street");

			// Entering address line two
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[2]/div/input"))
					.sendKeys("Longford Trading Estate Stretford");

			// Entering state
			Thread.sleep(500);
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[6]/div/input"))
					.sendKeys("Greater Manchester");

			// Entering city
			Thread.sleep(250);
			js.executeScript("window.scrollBy(0,50)", "");
			Thread.sleep(500);
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[7]/div/input"))
					.sendKeys("Manchester");

			// Entering mobile number
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[8]/div/div[1]/input"))
					.sendKeys("+443222204317");
			Thread.sleep(500);

			System.out.println("Shipping address for guest mob,Pass");

			// Write report
			wr.writeReport("Shipping address for guest mob ,Passed");
		} catch (Exception e) {
			System.out.println("Guest shipping address,Fail");
			Thread.sleep(500);
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Shipping address for guest mob ,Failed");
			wr.writeReport("******");

		}
	}
}
