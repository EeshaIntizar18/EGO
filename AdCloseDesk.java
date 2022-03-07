import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

public class AdCloseDesk extends Parent {
public void adClose() throws Exception
{
	try {
	// Closing PopUp window
				driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();
				Thread.sleep(1000);

				System.out.println("Add closed for desk,Pass");
				
				// Write Report
				wr.writeReport("           ");
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
				String time = dateFormat.format(new Date());
				wr.writeReport("****Test Case/Scenario****,Status,Time: " + time);
				wr.writeReport("Add closed for Desk,Passed");
				
			} catch (Exception e) {
				System.out.println("Add closed for desk,Fail");
				driver.quit();

				// Write Report
				wr.writeReport("           ");
				wr.writeReport("****Test Case/Scenario****,Status");
				wr.writeReport("Add closed for Desk,Failed");
				wr.writeReport("******");

				// ScreenRecoder
				ScreenRecorderUtil.stopRecord();
			}
}
}
