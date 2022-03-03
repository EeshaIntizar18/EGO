
public class DeskGuestFun extends Parent {
	public void guestDesk() throws Exception {
		try {

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
				ShippingMethodDesk sm1 = new ShippingMethodDesk();
				sm1.shipping_method();
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
			System.out.println("Guest functions for desk,Passed");
			
			// Close driver
			driver.close();
			
			// Write Report
			wr.writeReport("Functions for desk,Passed");

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

		} catch (Exception e) {
			System.out.println("Functions failed for Desk");
			Thread.sleep(500);
			driver.close();

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Fucntions for desk,Failed");
			wr.writeReport("**********");
		}
	}
}
