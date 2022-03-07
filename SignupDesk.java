
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignupDesk extends Parent {
	static int value;

	public void signup() throws Exception {
		try {
			// Check login validation
			String ExpectedURL = "https://ego.co.uk/";
			String newUrl = driver.getCurrentUrl();
			if (newUrl.equalsIgnoreCase(ExpectedURL)) {

				System.out.println("Sucessful login,no need to create account");
				Thread.sleep(1000);
				value = 1;
				System.out.println("value=" + value);
			} else {
				System.out.println(value);
				String actual = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expected3 = "reCAPTCHA";
				String expected2 = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				String expected = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
				compareStrings = actual.equals(expected) || actual.contains(expected2) || actual.contains(expected3);
				if (compareStrings == true) {

					// Mouse over on account button
					Thread.sleep(2000);
					WebElement accountIcon = driver.findElement(
							By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div[1]/button"));
					Actions actions = new Actions(driver);
					actions.moveToElement(accountIcon).perform();
					Thread.sleep(1000);

					// Clicking on create account
					driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[3]/div[1]/ul/li[2]/a"))
							.click();
					Thread.sleep(2000);

					// Enter first name
					driver.findElement(By.id("firstname")).sendKeys("Test");
					Thread.sleep(500);

					// Enter last name
					driver.findElement(By.id("lastname")).sendKeys("Test");
					Thread.sleep(500);

					// Enter email
					driver.findElement(By.id("email_address")).sendKeys("usman.ali@rltsquare.com");
					Thread.sleep(500);

					// Enter password
					driver.findElement(By.id("password")).sendKeys("@Mani112233");
					Thread.sleep(500);

					// Enter password confirmation
					driver.findElement(By.id("password-confirmation")).sendKeys("@Mani112233");
					Thread.sleep(1000);

					// Enter DOB
					driver.findElement(By.id("dob")).sendKeys("08/09/1998");
					Thread.sleep(1000);

					// Click on Check-Box
					driver.findElement(By.id("assistance_allowed_checkbox")).click();
					Thread.sleep(1000);

					// Click on create account button
					driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"))
							.click();
					Thread.sleep(1000);

					// Check account already exist or not
					String actuals = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div"))
							.getText();
					String expected1 = "There is already an account with this email address. If you are sure that it is your email address, ";
					String expected22 = "reCAPTCHA";
					signupdesk = actuals.contains(expected1) || actuals.contains(expected22);

					Thread.sleep(3000);

					if (signupdesk == true) {
						System.out.println("Account already exist");
						// Writing Report
						wr.writeReport("Sign Up for Desk ,Failed");
						wr.writeReport("******");
					} else {
						value = 2;
						System.out.println("Account successfuly created");
						System.out.println(2);
						Thread.sleep(1000);
						System.out.println("Signup for desk,Pass");
						wr.writeReport("Sign Up for Desk ,Passed");
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Register element not found");
			driver.quit();
			Thread.sleep(1000);
			// Writing Report
			wr.writeReport("Sign Up registered element,Failed");
			wr.writeReport("******");
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
		}

	}
	// Getter

	public int getValue() {
		return value;
	}

}
