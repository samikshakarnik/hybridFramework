package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.resources.CommonMethods;

public class LoginPageTest extends BaseTest{
	
	
	@Test
	public void loginPageTitle() {
		String actualTitle= loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void loginPageUrl() {
		String actualURL = loginPage.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void forgotPwdLink() {
		Assert.assertTrue(loginPage.isforgotPwdLinkExist()); 
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		loginPage.doLogin(CommonMethods.EmailGenerate(), "Test@1234");
	}
	
	@Test
	public void usernameTest() {
		System.out.println("Username: " + CommonMethods.userName());
	}
	
	@Test
	public void phonenum() {
		System.out.println("phonenumber: " + CommonMethods.password());
	}

}
