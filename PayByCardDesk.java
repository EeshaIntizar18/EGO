import org.openqa.selenium.By;

public class PayByCardDesk extends Parent {

	public void card() throws Exception {
		try {
			Thread.sleep(500);
			// Clicking on pay now by card
			driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[1]/label"))
					.click();
			Thread.sleep(500);

			// Scrolling down
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(500);

			// Entering card details
			driver.switchTo().frame(driver.findElement(
					By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[1]/label/div/span/iframe")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedCardNumber\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedCardNumber\"]")).sendKeys("3700 000000 00002");
			Thread.sleep(500);
			driver.switchTo().defaultContent();

			// Add expire date
			Thread.sleep(1500);

			// Converting iFrame to frame
			driver.switchTo().frame(driver.findElement(
					By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[2]/div[1]/label/div/span/iframe")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedExpiryDate\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedExpiryDate\"]")).sendKeys("0330");
			Thread.sleep(500);
			driver.switchTo().defaultContent();

			// Add CVV
			Thread.sleep(1500);

			// Converting iFrame to frame
			driver.switchTo().frame(driver.findElement(
					By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[2]/div[2]/label/div/span/iframe")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedSecurityCode\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"encryptedSecurityCode\"]")).sendKeys("7373");
			Thread.sleep(500);
			driver.switchTo().defaultContent();

			// Add name
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("T");
			driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("e");
			driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("s");
			driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("t");
			Thread.sleep(500);

			// Click on place order button
//					Thread.sleep(1500);
//					driver.findElement(By.xpath("//*[@id=\"adyen-cc-form\"]/div[3]/div/button")).click();

			System.out.println("Pay by card for desk,Pass");

			// Write Report
			wr.writeReport("Pay by card for desk ,Passed");
			Thread.sleep(3000);

			// Closing the browser
			driver.close();
			// Write Report
			wr.writeReport("Functions for desk ,Passed");
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

		} catch (Exception e) {
			System.out.println("Unsucessful Pay-by-card for Desk");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Pay by card for desk ,Failed");
			wr.writeReport("******");
		}
	}
}
