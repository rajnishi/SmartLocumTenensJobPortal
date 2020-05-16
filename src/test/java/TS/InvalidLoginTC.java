package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.LoginPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTC extends BaseTest {
    public InvalidLoginTC() {
    }

    public InvalidLoginTC(WebDriver passDriver) {
        driver = passDriver;

    }

    @Test

    public void VerifyInvalidLoginSLT() {
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("Config.properties");
        LoginPO loginPOObj = new LoginPO(driver);


        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.SignIN_xpath), "Once url is open unable to click on Sign In");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Once Url is open click on Sign In ", "User should able to click on sign in button");

        Assert.assertTrue(loginPOObj.enterTextInInputBtn(loginPOObj.LoginEmail_xpath, readFromPropFileObj.getEmail()), "Unable to enter email");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter email ID ", "User should able to enter emaild ID");

        Assert.assertTrue(loginPOObj.enterTextInInputBtn(loginPOObj.LoginPwd_xpath, readFromPropFileObj.getPwd()), "Unable to enter password");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter password ", "User should able to enter password");

        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.LoginRemMe_xpath), "Unable to click on Remember Me");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on remember me button ", "User should able to click on remember me button");


        Assert.assertTrue(loginPOObj.clickOnLinkBtn(loginPOObj.LoginSignIn_xpath), "Unable to click on Sign In");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sign In button to login ", "User should able to click on sign in button to login");

        String expectedToastMessage = "Invalid password";
        Assert.assertEquals(loginPOObj.findText(loginPOObj.InvalidPass_xpath),expectedToastMessage);
        System.out.println("Toast message: " + loginPOObj.findText(loginPOObj.InvalidPass_xpath));


    }
}
