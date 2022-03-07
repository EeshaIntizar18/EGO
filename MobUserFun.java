
public class MobUserFun extends Parent {
	public void mobileFunctions() throws Exception {
		try {

			//Create instance for ad mobile
			AdCloseMob add=new AdCloseMob();
			add.adClosemob();
			
			// Create instance for mobile login
			LoginMobile lm = new LoginMobile();
			lm.loginMobile();
			Thread.sleep(500);

			// Create instance for SignUp mobile
			SignupMobile sm1 = new SignupMobile();
			sm1.signupMobile();
			Thread.sleep(500);

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

			} else if (z1 == 2) {
				NewUserDetailsMob mn1 = new NewUserDetailsMob();
				mn1.userdetailss();
				ShippingMethodMob smmc = new ShippingMethodMob();
				smmc.shipping_method_mobile();
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
			
			//Close driver
			driver.close();
			
			//ScreenRecoder
			ScreenRecorderUtil.stopRecord();
		} 
		catch (Exception e) {
			Thread.sleep(500);
			driver.quit();
			Thread.sleep(1000);
			ScreenRecorderUtil.stopRecord();

		}
	}
}
