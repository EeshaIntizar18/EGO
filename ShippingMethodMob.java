import org.openqa.selenium.By;

public class ShippingMethodMob extends Parent {
	public void shipping_method_mobile() throws Exception {
		try {
			//Scrolling Down
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,350)", "");
			
			// Clicking on shipping method
			driver.findElement(By.xpath("//*[@id=\"label_method_royalmailnextworkingday_RoyalMailHV\"]")).click();
			Thread.sleep(3000);
			
			System.out.println("Shipping method for mob,Pass");
			
			//Writing Report
			wr.writeReport("ShipingMethod for Mob sucessfull,Passed");
		} catch (Exception e) {
			System.out.println("Shipping method,Fail ");
			driver.quit();
			Thread.sleep(1000);
			
			//ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			
			//Writing Report
			wr.writeReport("Shipping Method for Mob ,Failed");
			wr.writeReport("******");
		}
	}
}
