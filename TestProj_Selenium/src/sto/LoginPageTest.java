package sto;

import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void checkValidUser() throws Exception {

		BrowserFactory.driver = BrowserFactory.startBrowser("Chrome", "http://localhost:8080/cleo");
		LoginPage loginPage = new LoginPage(BrowserFactory.driver);
		 KundenverwaltungPage kundenVerwaltungPage = new KundenverwaltungPage(BrowserFactory.driver);

//		assertTrue(loginPage.isInitialized());

		loginPage.loginCleo("makler1", "12345a");

		// assertTrue(kundenVerwaltungPage.isInitialized());

	}
}