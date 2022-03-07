import org.openqa.selenium.By;

public class PdpDesk extends Parent {
	public void pdp() throws Exception {
		try {

			// Clicking on Fiat lace product
			driver.findElement(
					By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[4]/div[2]/ol/li[2]/div/div[2]/strong/a"))
					.click();
			Thread.sleep(3000);

			String ExpectedURL1 = "https://ego.co.uk/hab478-fiat-lace-up-square-toe-sculptured-heel-in-black-faux-leather.html";
			String newUrls = driver.getCurrentUrl();
			if (newUrls.equalsIgnoreCase(ExpectedURL1)) {
				System.out.println("Fiat lace product,Pass");
				wr.writeReport("Fiat lace product,Passed");
			} else {
				System.out.println("Fiat lace product,Fail");
				wr.writeReport("Fiat lace product,Failed");
				driver.quit();

			}

			// Scrolling down
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);

			// Clicking on product size
			driver.findElement(By.className("custom-select__trigger-size")).click();
			Thread.sleep(1000);

			// Selecting size
			driver.findElement(By.id("controlId-item-17")).click();
			Thread.sleep(1500);

			// Clicking on add to cart button
			driver.findElement(By.id("product-addtocart-button")).click();
			Thread.sleep(2000);

			System.out.println("Pdp page for desk,Pass");

			// Write Report
			wr.writeReport("PDP for desk ,Passed");

		} catch (Exception e) {
			System.out.println("PDP page for Desk,Fail");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("PDP for desk ,Failed");
			wr.writeReport("******");
		}
	}
}
