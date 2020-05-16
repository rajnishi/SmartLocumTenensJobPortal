package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.LoginPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseTest {
    public LoginTC() {  }

    public LoginTC(WebDriver passDriver) { driver = passDriver;   }

    @Test
    public void VerifyLoginSLT() {
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("Config.properties");
        LoginPO loginPOObj = new LoginPO(driver);

        //************************Login Page*****************************//

        ExtentTestManager.getTest().getTest().setName("SMT-001: Verify Login");

        //1. Click on Sign In tab to login
        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.SignIN_xpath), "Once url is open unable to click on Sign In");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Once Url is open click on Sign In ", "User should able to click on sign in button");

        //2. Enter valid email address
        Assert.assertTrue(loginPOObj.enterTextInInputBtn(loginPOObj.LoginEmail_xpath, readFromPropFileObj.getEmail()), "Unable to enter email");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter email ID ", "User should able to enter emaild ID");

        //3. Enter valid password
        Assert.assertTrue(loginPOObj.enterTextInInputBtn(loginPOObj.LoginPwd_xpath, readFromPropFileObj.getPwd()), "Unable to enter password");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter password ", "User should able to enter password");

        //4. Click on to 'Remember Me' button for next login optinal
        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.LoginRemMe_xpath), "Unable to click on Remember Me");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on remember me button ", "User should able to click on remember me button");

        //5. Click on 'Sign In' button
        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.LoginSignIn_xpath), "Unable to click on Sign In");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sign In button to login ", "User should able to click on sign in button to login");

        //6. Verify if user is redirected to home page by verifying the text 'Healthcare Professional'
        //String expectedName = "Welcome devraj";
        String expectedName = "Welcome Raj";
        Assert.assertEquals(loginPOObj.findText(loginPOObj.Textverify_xpath), expectedName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on user logged in text to verify ", "User is redirected to home page and able to capture the text 'Welcome Raj'");
        System.out.println("Title is: " + loginPOObj.findText(loginPOObj.Textverify_xpath));
    }
}
