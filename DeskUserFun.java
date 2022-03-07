
public class DeskUserFun extends Parent {
	public static void deskFunctions() throws Exception {
		try {
			AdCloseDesk ad=new AdCloseDesk();
			ad.adClose();
			
			// Create instance of login class
			LoginDesk ln = new LoginDesk();
			ln.login();
			Thread.sleep(1000);

			// Create instance SignUp class
			SignupDesk su = new SignupDesk();
			su.signup();
			Thread.sleep(2000);

			// Create instance for search class
			SearchDesk s = new SearchDesk();
			s.search();
			Thread.sleep(1000);

			// Create instance for filter class
			FiltersDesk f = new FiltersDesk();
			f.filters();
			Thread.sleep(1000);

			// Create instance for pdp class
			PdpDesk p = new PdpDesk();
			p.pdp();
			Thread.sleep(3000);

			// Create instance for cart class
			ViewBagDesk c = new ViewBagDesk();
			c.viewBagDesk();
			Thread.sleep(2000);

			// Create instance for shipping-address_user class
			SignupDesk value = new SignupDesk();
			int z = value.getValue();
			if (z == 1) {

				// Create instance for shipping method
				Thread.sleep(1000);
				ShippingMethodDesk sm1 = new ShippingMethodDesk();
				sm1.shipping_method();
				Thread.sleep(1000);

			} else if (z == 2) {
				NewUserDetailsDesk nud = new NewUserDetailsDesk();
				nud.newUser();
				Thread.sleep(1000);

				// Create instance for shipping method
				ShippingMethodDesk smm1 = new ShippingMethodDesk();
				smm1.shipping_method();
				Thread.sleep(1000);

			} else {

				// Create instance for shipping-address_guest class
				ShipAddressGuestDesk ss = new ShipAddressGuestDesk();
				ss.shipping_address();
				Thread.sleep(1000);

				// Create instance for shipping method
				ShippingMethodDesk sm = new ShippingMethodDesk();
				sm.shipping_method();
				Thread.sleep(1000);

			}

			// Create instance for Billing class
			PaymentMethodDesk bb = new PaymentMethodDesk();
			bb.billing();
			Thread.sleep(1000);

			// Create instance for Pay-by-card
			PayByCardDesk pc = new PayByCardDesk();
			pc.card();
			Thread.sleep(1000);
			
			

		} catch (

		Exception e) {
			System.out.println("Functions failed for Desk");
			Thread.sleep(500);
			driver.quit();

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			// Write Report
			wr.writeReport("Functions for desk ,Failed");
			wr.writeReport("**********");

		}
	}
}