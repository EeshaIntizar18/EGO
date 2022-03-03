import org.openqa.selenium.By;

public class SignupMobile extends Parent {
	static int c1 = 0;

	public void signupMobile() throws Exception {
		try {
			// Check login validation
			String ExpectedURL = "https://ego.co.uk/customer/account/";
			String newUrl = driver.getCurrentUrl();
			if (newUrl.equalsIgnoreCase(ExpectedURL)) {

				System.out.println("Sucessful,no need to create account");
				Thread.sleep(1000);
				c1 = 1;
				System.out.println("value" + c1);

			} else {
				String actual = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expected3 = "reCAPTCHA";
				String expected2 = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				String expected = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				a = actual.equals(expected) || actual.contains(expected2) || actual.contains(expected3);
				if (a == true) {
					Thread.sleep(500);
					js.executeScript("window.scrollBy(0,450)", "");
					Thread.sleep(500);
					driver.findElement(
							By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[2]/div[2]/div/div/a/span")).click();
					Thread.sleep(1500);
					driver.findElement(By.id("firstname")).sendKeys("Test");
					Thread.sleep(500);
					driver.findElement(By.id("lastname")).sendKeys("Test");
					Thread.sleep(500);
					driver.findElement(By.id("dob")).sendKeys("08/09/1998");
					Thread.sleep(500);
					driver.findElement(By.id("assistance_allowed_checkbox")).click();
					Thread.sleep(500);
					driver.findElement(By.id("email_address")).sendKeys("usman.ali@rltsquare.com");
					Thread.sleep(500);
					driver.findElement(By.id("password")).sendKeys("@Mani112233");
					Thread.sleep(500);

					// Scrolling down
					js.executeScript("window.scrollBy(0,250)", "");
					Thread.sleep(1000);

					// Password confirmation
					driver.findElement(By.id("password-confirmation")).sendKeys("@Mani112233");
					Thread.sleep(500);

					// Scrolling down
					js.executeScript("window.scrollBy(0,250)", "");
					Thread.sleep(1000);

					driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"))
							.click();
					Thread.sleep(500);

					// Check account already exist or not
					String actuals = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div"))
							.getText();
					Thread.sleep(500);
					String expected1 = "There is already an account with this email address. If you are sure that it is your email address, ";
					b = actuals.contains(expected1);
					Thread.sleep(1000);
					if (b == true) {
						System.out.println("Account already exist");
					} else {
						c1 = 2;
						System.out.println("Account successfuly created");
						System.out.println(c1);
						Thread.sleep(1000);
					}
				}

			}
			System.out.println("Signup for mob,Pass");
			wr.writeReport("Sign Up for Mob ,Passed");
		} catch (Exception e) {
			System.out.println("Signup for mobile,Fail");
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Writing Report
			wr.writeReport("Sign Up for Mob ,Failed");
			wr.writeReport("******");
		}
	}

	// Getter
	public int getValues() {
		return c1;
	}

}
