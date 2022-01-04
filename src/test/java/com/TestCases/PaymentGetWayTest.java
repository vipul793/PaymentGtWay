/**
 * 
 */
package com.TestCases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.PageObject.HomePage;
import com.PageObject.LoginPage;
import com.PageObject.OrderSummeryPage;
import com.PageObject.WishListPage;
import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class PaymentGetWayTest extends BaseClass {
	
	HomePage hp;
	LoginPage lp;
	OrderSummeryPage op;
	WishListPage wp ;
	
	@BeforeMethod
	public void setup() {
		LaunchApp();
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	
	@org.testng.annotations.Test
	public void Test() {
		hp = new HomePage();
		lp = new LoginPage();
		
		wp = new WishListPage();
		op = new OrderSummeryPage();
		hp.verifyTitle();
		hp.verifyLogo();
		hp.clickSignIn();
		
		lp.typeEmail();
		lp.typePassword();
		lp.scrollDowntoLoginbtn();
		
		wp.searchProduct();
		wp.MovetoElement();
		wp.proceedtoCheck();
		op.confirmOrider();
	}
	

}
