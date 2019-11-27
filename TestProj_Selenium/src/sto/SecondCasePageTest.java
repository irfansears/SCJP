package sto;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SecondCasePageTest {

@Test
public void processSelectedKunden() throws Exception {

    System.out.println(BrowserFactory.driver);

    SecondCasePage scPage = new SecondCasePage(BrowserFactory.driver);

//    assertTrue(scPage.isInitialized());

    scPage.selectCostumer(0);


}
}