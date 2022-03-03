
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginDesk extends Parent {

	public void login() throws Exception {

		// Mouse over on account button
		Thread.sleep(2000);
		try {
			WebElement accountIcon = driver
					.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div[1]/button"));
			Actions actions = new Actions(driver);
			actions.moveToElement(accountIcon).perform();
			Thread.sleep(2000);

			// Clicking on login button
			driver.findElement(By.xpath("//*[@id=\"jq-account-trigger\"]/span")).click();
			Thread.sleep(3000);

			// Clicking on email
			WebElement email = driver.findElement(By.id("email"));
			Thread.sleep(1000);

			// Entering email
			email.sendKeys("usman.ali@rltsquare.com");
			Thread.sleep(1000);

			// Selecting password field
			WebElement password = driver.findElement(By.id("pass"));
			Thread.sleep(1000);

			// Entering password
			password.sendKeys("@Mani112233");
			Thread.sleep(1000);

			// Scrolling down
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);

			// Selecting SigIn button
			WebElement login = driver.findElement(By.id("send2"));
			Thread.sleep(1000);

			// Clicking on SignIn button.
			login.click();
			Thread.sleep(3000);

			// Check login validation
			String ExpectedURL = "https://ego.co.uk/";
			String newUrl = driver.getCurrentUrl();
			if (newUrl.equalsIgnoreCase(ExpectedURL)) {

				System.out.println("Login for desk,Pass");
				Thread.sleep(1000);

				// Write Report
				wr.writeReport("Login for desk ,Passed");

			}

			else {
				String actual = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expected3 = "reCAPTCHA";
				String expected2 = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				String expected = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				a = actual.equals(expected) || actual.contains(expected2) || actual.contains(expected3);
				if (a == true) {
					System.out.println("Login for Desk,Fail");
					Thread.sleep(2000);
					System.out.println("Account temporarirly disbaled text appeared");

					// Write Report
					wr.writeReport("Login for desk ,Failed");
					wr.writeReport("******");

				}

			}
		} catch (Exception e) {
			System.out.println("Regitered element not found");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

		}
	}
}