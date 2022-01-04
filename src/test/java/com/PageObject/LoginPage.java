/**
 * 
 */
package com.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	public WebElement emailField;
	
	@FindBy(css="#passwd")
	public WebElement password;
	
	@FindBy(id="SubmitLogin")
	public WebElement loginBtn;
	
	public void typeEmail() {
		emailField.sendKeys("admin@xyz.com");
	}
	public void typePassword() {
		password.sendKeys("admin@123");
	}
	
	public WishListPage scrollDowntoLoginbtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loginBtn);
		loginBtn.click();
		
		return new WishListPage();
	}

}
