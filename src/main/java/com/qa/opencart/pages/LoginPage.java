package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
private WebDriver driver;
	
	private By emailId = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Login page title: " + title);
		return title;
	}
	
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl(); 
		System.out.println("Current page URL: " + url);
		return url;
	}
	
	public boolean isforgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public AccountsPage doLogin(String un, String pw) {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(loginBtn).click();
		return new AccountsPage(driver);
	}

}
