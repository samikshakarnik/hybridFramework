package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage{

	 private WebDriver driver;

	private By logoutLink = By.linkText("Logout");
	// private By ourderHistoryLink = By.linkText("Order History");
	private By accountsPgHeader = By.cssSelector("div#content h2");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}


	public String pageTitle() {
		String actualPageTitle = driver.getTitle();
		System.out.println("Page Title: " + actualPageTitle);
		return actualPageTitle;
	}

	public String pageUrl() {
		String actualURL = driver.getCurrentUrl();
		System.out.println("Page URL: " + actualURL);
		return actualURL;
	}

	public Boolean logoutLink() {
		return driver.findElement(logoutLink).isDisplayed();
	}

	public List<String> getAccountsPageHeaderList() {
		List<WebElement> list = driver.findElements(accountsPgHeader);
		List<String> accHeaderList = new ArrayList<String>();

		for (WebElement acc : list) {
			String text = acc.getText();
			accHeaderList.add(text);
		}
		return accHeaderList;
	}

}
