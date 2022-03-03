import org.openqa.selenium.By;

public class NewUserDetailsMob extends Parent {
public void userdetailss() throws Exception {
	try {

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
				js.executeScript("window.scrollBy(0,50)", "");
				driver.findElement(By
						.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[6]/div/input"))
						.sendKeys("Greater Manchester");

				// Entering city
				Thread.sleep(350);
				js.executeScript("window.scrollBy(0,50)", "");
				Thread.sleep(500);
				driver.findElement(By
						.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[7]/div/input"))
						.sendKeys("Manchester");

				// Entering mobile number
				Thread.sleep(500);
				js.executeScript("window.scrollBy(0,50)", "");
				driver.findElement(By.xpath(
						"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[8]/div/div[1]/input"))
						.sendKeys("+443222204317");
				Thread.sleep(1000);
				System.out.println("Guest shipping address,Pass");
				
				//Write report
				wr.writeReport("Shipping address for new user mob ,Passed");
			} catch (Exception e) {
				System.out.println("Unsucessful guest shipping address");
				Thread.sleep(500);
				driver.quit();
				Thread.sleep(1000);
				
				//ScreenRecoder
				ScreenRecorderUtil.stopRecord();
				
				//Write Report
				wr.writeReport("Shipping address for new user mob ,Failed");
				wr.writeReport("******");

			}
		}
	

}
