package com.qa.opencart.tests;

import java.util.List;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountPageTest extends BaseTest {
	
	@Test(priority = -1)
	public void accPageSetup() {
		System.out.println("inside beforeclass method");
		accPage = loginPage.doLogin("sammmm@gmail.com", "Test@1234");
	}
	
	@Test
	public void getPageURL() {
		String actualURL = accPage.pageUrl();
		Assert.assertTrue(actualURL.contains("route=account/account"));
	}
	
	@Test
	public void getPageTitle () {
		String actualPageTitle = accPage.pageTitle();
		Assert.assertEquals(actualPageTitle, "My Account");
	}
	
	@Test
	public void getLogoutLink() {
		Assert.assertTrue(accPage.logoutLink()); 
	}
	
	@Test
	public void getHeadersList() {
		List<String> headerList = accPage.getAccountsPageHeaderList();
		Assert.assertEquals(headerList.size(), 4);
	}

}
