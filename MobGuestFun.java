
public class MobGuestFun extends Parent {
	public void guestFuncMob() throws Exception {
		try {

			// Create instance for Search mobile
			SearchMobile ss1 = new SearchMobile();
			ss1.searchMobile();
			Thread.sleep(1000);

			// Create instance for filters
			FiltersMobile fm = new FiltersMobile();
			fm.filtersMobile();
			Thread.sleep(500);

			// Create instance for Pdp
			PdpMobile pm = new PdpMobile();
			pm.pdpMobile();
			Thread.sleep(1000);

			// Create instance for cart
			ViewBagMob cm = new ViewBagMob();
			cm.cartMobile();
			Thread.sleep(500);
			Thread.sleep(500);

			// Create instance for shipping address
			SignupMobile value1 = new SignupMobile();

			int z1 = value1.getValues();
			System.out.println(z1);
			Thread.sleep(2500);
			if (z1 == 1) {
				ShippingMethodMob smm = new ShippingMethodMob();
				smm.shipping_method_mobile();
				Thread.sleep(500);

			} else {
				ShippingAddressGuestMob smm = new ShippingAddressGuestMob();
				smm.shipping_address_GuestMobile();
				Thread.sleep(500);
				ShippingMethodMob smm1 = new ShippingMethodMob();
				smm1.shipping_method_mobile();
				Thread.sleep(500);
			}

			// Create instance for billing
			PayementMethodMob bm = new PayementMethodMob();
			bm.billingMobile();
			Thread.sleep(500);

			// Create instance for pay_by_card
			PayByCardMob pb = new PayByCardMob();
			pb.cardMobile();
			Thread.sleep(500);
			System.out.println("Guest functions for mob,Pass");
			driver.close();
			
			// Write Report
			wr.writeReport("Functions for Mob,Passed");
			
			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {
			System.out.println("Mobile functions for guest,Failed ");
			Thread.sleep(500);
			driver.quit();
			Thread.sleep(1000);

			// ScreenRecoder
			ScreenRecorderUtil.stopRecord();

			// Write Report
			wr.writeReport("Fucntions for Mob,Failed");
			wr.writeReport("**********");
		}
	}
}
