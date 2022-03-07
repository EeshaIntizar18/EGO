import org.openqa.selenium.By;

public class ViewBagMob extends Parent {
	public void cartMobile() throws Exception {
		try {
			// Clicking on view bag button
			driver.findElement(By.className("view")).click();
			Thread.sleep(4000);

			// Clicking on Quantity
			driver.findElement(By.xpath("//select[@data-role='cart-item-qty']")).click();
			Thread.sleep(2000);

			// Changing Quantity
			driver.findElement(By.xpath(
					"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[2]"))
					.click();
			Thread.sleep(3000);

			// Scrolling down
			js.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(1000);

			// Clicking on Checkout button
			driver.findElement(By.xpath("//span[text()='CHECKOUT SECURELY']")).click();
			Thread.sleep(2500);

			// Entering Email
			Thread.sleep(2500);

			// Print
			System.out.println("View Bag for mob,Pass");

			// Write report
			wr.writeReport("View Bag for Mob ,Passed");

		} catch (Exception e) {
			System.out.println("Cart page,Fail");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Writing Report
			wr.writeReport("View Bag for Mob ,Failed");
			wr.writeReport("******");
		}
	}

}