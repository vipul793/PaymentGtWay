/**
 * 
 */
package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class WishListPage extends BaseClass {

	public WishListPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_query_top")
	public WebElement searchBox;

	@FindBy(name = "submit_search")
	public WebElement searchBtn;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	public WebElement shirtpic;

	@FindBy(xpath = "//a[@title='Add to cart']")
	public WebElement addtoCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	public WebElement proceedToCheck;

	public void searchProduct() {
		searchBox.sendKeys("shirt");
		searchBtn.click();
	}
	public void MovetoElement() {
		Actions action = new Actions(driver);
		action.moveToElement(shirtpic);
		action.moveToElement(addtoCart).click().build().perform();
	}
	public OrderSummeryPage proceedtoCheck() {
		proceedToCheck.click();
		return new OrderSummeryPage();
	}
	
}
