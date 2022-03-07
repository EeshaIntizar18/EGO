import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

public class AdCloseMob extends Parent{
public void adClosemob() throws Exception {
	try {
		// Closing PopUp window
		driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();
		Thread.sleep(1000);

		System.out.println("Add closed for mob,Pass");

		// Write Report
		wr.writeReport("           ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		String time = dateFormat.format(new Date());
		wr.writeReport("****Test Case/Scenario****,Status,Time: " + time);
		wr.writeReport("Add closed for Mob,Passed");

	} catch (Exception e) {
		System.out.println("Add closed for mob,Fail");

		// Write Report
		wr.writeReport("           ");
		wr.writeReport("****Test Case/Scenario****,Status");
		wr.writeReport("Add closed for Mob,Failed");
		// ScreenRecoder
		ScreenRecorderUtil.stopRecord();
	}

}
}
