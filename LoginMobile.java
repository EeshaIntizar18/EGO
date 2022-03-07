
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginMobile extends Parent {
	public void loginMobile() throws Exception {

		Thread.sleep(2000);
		try {
			// Clicking on menu button
			WebElement selectMenuOption = driver
					.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[1]/span"));
			selectMenuOption.click();
			Thread.sleep(1000);

			// Clicking on account button
			driver.findElement(By.className("porto-icon-user")).click();
			Thread.sleep(1000);

			// Clicking on login button
			driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
			Thread.sleep(1000);

			// Clicking on email
			WebElement email = driver.findElement(By.id("email"));
			Thread.sleep(500);

			// Entering email
			email.sendKeys("usman.ali@rltsquare.com");
			Thread.sleep(500);

			// Selecting password field
			WebElement password = driver.findElement(By.id("pass"));
			Thread.sleep(500);

			// Entering password
			password.sendKeys("@Mani112233");
			Thread.sleep(1000);

			// Scrolling down
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);

			// Selecting SigIn button
			WebElement login = driver.findElement(By.id("send2"));
			Thread.sleep(1000);

			// Clicking on SignIn button
			login.click();
			Thread.sleep(3000);


			// Check login validation
			String ExpectedURL = "https://ego.co.uk/";
			String newUrl = driver.getCurrentUrl();
			if (newUrl.equalsIgnoreCase(ExpectedURL)) {

				System.out.println("Login for mob,Pass");
				Thread.sleep(1000);

				// Write Report
				wr.writeReport("Login for mob ,Passed");

			}

			else {
				String actual = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expected3 = "reCAPTCHA";
				String expected2 = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				String expected = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				compareStrings = actual.equals(expected) || actual.contains(expected2) || actual.contains(expected3);
				if (compareStrings == true) {
					System.out.println("Login for mob, fail");
					Thread.sleep(2000);
					System.out.println("Account temporarirly disbaled text appeared");

					// Write Report
					wr.writeReport("Login for mob ,Failed");
					wr.writeReport("******");

				}
			}
		}
		catch (Exception e) {
			System.out.println("Register element not found");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

		}

	}
}
