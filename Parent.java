import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Parent {
	public static WebDriver driver;
	static Boolean signupdesk = false;
	static Boolean signupmob=false;
	static Boolean compareStrings = false;
	static Boolean compareProduct=false;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static WritingReport wr = new WritingReport();

	public static void main(String[] args) throws Exception {
//
//		// Desktop for user
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserDesk.openBrowser();
//		DeskUserFun.deskFunctions();
//		ScreenRecorderUtil.stopRecord();

//		// Desktop for guest
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserDesk.openBrowser();
//		DeskGuestFun gfd = new DeskGuestFun();
//		gfd.guestDesk();
//		ScreenRecorderUtil.stopRecord();

//		// MOBILE for user
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserMobile.openBrowserMobile();
//		MobUserFun mx = new MobUserFun();
//		mx.mobileFunctions();
//		ScreenRecorderUtil.stopRecord();

		// MOBILE for guest
		Thread.sleep(1000);
		ScreenRecorderUtil.startRecord("Start Recording");
		BrowserMobile.openBrowserMobile();
		MobGuestFun mn=new MobGuestFun();
		mn.guestFuncMob();
		ScreenRecorderUtil.stopRecord();


	}
}
