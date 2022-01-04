/**
 * 
 */
package com.PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.BaseClass;

/**
 * @author Vipul
 *
 */
public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	public WebElement Logo;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signIn;

	public void verifyLogo() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = Logo.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("D:\\PaymentGetWay\\Logo\\Logo.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public LoginPage clickSignIn() {

		signIn.click();
		return new LoginPage();
	}

}
