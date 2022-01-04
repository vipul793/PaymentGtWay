/**
 * 
 */
package com.PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class SearchedProductPage extends BaseClass{
	static Select select;

	public SearchedProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//nav[@id='nav']//a")
	public List<WebElement> listEl;
	
	@FindBy(xpath="//select[@name='quantity']")
	public WebElement selectQuantity;
	
	
	@FindBy(xpath="//input[@class='button special']")
	public WebElement  BuyNow;
	
	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Guru99 Payment Gateway";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void verifygetWayLinks() {
		for (WebElement list : listEl) {
			if(list.isDisplayed()) {
				System.out.println(list.getText());
			}
			
		}
	}
	
	public void Scrollview() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1519.200,692.400)");
	}
	public void selectQuantity() {
		select = new Select(selectQuantity);
		select.selectByValue("1");
	}
	public PaymentPage clickBuyNow() {
		BuyNow.click();
		return new PaymentPage();
	}
}
