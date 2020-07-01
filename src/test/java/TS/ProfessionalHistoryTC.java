package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.ProfessionalHistoryPO;
import PO.ProfessionalLiabilityInsurancePO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfessionalHistoryTC extends BaseTest {

    @Test

    public void verifyProfessionalHistorySLT(){

        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        ProfessionalHistoryPO ProfHistObj = new ProfessionalHistoryPO(driver);
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");

        //*****************Credentialing Info - Professional History Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-017: Verify Professional History page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(ProfHistObj.clickOnLinkBtn(ProfHistObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(ProfHistObj.clickOnLinkBtn(ProfHistObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Prof History
        Assert.assertTrue(ProfHistObj.clickOnLinkBtn(ProfHistObj.ProfHistTab_xpath), "Unable to click on professional history tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on professional history tab ", "User able to click on professional history tab");

        //4. Click on Save
        Assert.assertTrue(ProfHistObj.clickOnLinkBtn(ProfHistObj.ProfHistSave_xpath), "Unable to click on save");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on save button", "User able to successfully save all the records in credentialing Information");


    }
}
