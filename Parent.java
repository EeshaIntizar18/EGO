import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Parent {
	public static WebDriver driver;
	static Boolean b = null;
	static Boolean compareStrings = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static WritingReport wr = new WritingReport();

	public static void main(String[] args) throws Exception {

		// Desktop for user
		ScreenRecorderUtil.startRecord("Start Recording");
		BrowserDesk.openBrowser();
		DeskUserFun.deskFunctions();
//
//		// Desktop for guest
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserDesk.openBrowser();
//		GuestFunctionsDesk gfd = new GuestFunctionsDesk();
//		gfd.guestDesk();

//		// MOBILE for user
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserMobile.openBrowserMobile();
//		MobileFunctions mx = new MobileFunctions();
//		mx.mobileFunctions();

//		// MOBILE for guest
//		ScreenRecorderUtil.startRecord("Start Recording");
//		BrowserMobile.openBrowserMobile();
//		MobGuestFun mn=new MobGuestFun();
//		mn.guestFuncMob();

	}
}
