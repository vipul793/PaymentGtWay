/**
 * 
 */
package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class PaymentPage extends BaseClass {

	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Payment Process']")
	public WebElement header;
	
	public void verifyHeader() {
		if(header.equals("Payment Process")) {
			Assert.assertTrue(true);
		}
	}
}
