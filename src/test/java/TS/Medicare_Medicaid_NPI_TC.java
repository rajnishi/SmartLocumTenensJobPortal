package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.Medicare_Medicaid_NPI_PO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Medicare_Medicaid_NPI_TC extends BaseTest {
    @Test

    public void verifyMedicareMedicaidNPISLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        //****************Reading data from Read From Prop File********************//
        ReadFromPropFile readFromPropFileSCSObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        Medicare_Medicaid_NPI_PO npipoObj = new Medicare_Medicaid_NPI_PO(driver);

        //*****************Credentialing Info - Medicare/Medicaid/NPI Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-007: Verify Medicare Medicaid NPI ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(npipoObj.clickOnLinkBtn(npipoObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(npipoObj.clickOnLinkBtn(npipoObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Medicare/Medicaid/NPI tab
        Assert.assertTrue(npipoObj.clickOnLinkBtn(npipoObj.NPITab_xpath), "Unable to click on Medicare/Medicaid/NPI  tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Medicare/Medicaid/NPI tab ", "User able to click on Medicare/Medicaid/NPI tab");

        //4. Click on Type dropdown to select option
        Thread.sleep(2000);
        Assert.assertTrue(npipoObj.selectFromDropDownBtn(npipoObj.TypeDrpDown_xpath, npipoObj.SelectTypeDrpDown_xpath), "Unable to click on Type drop down button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Type drop down button and select option ", "User able to click Type drop down button and select the option");

        //5. Enter NPI number
        Assert.assertTrue(npipoObj.enterTextInInputBtn(npipoObj.NipNum_xpath, readFromPropFileSCSObj.getNPINumber()), "Unable to enter NPI number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter NPI number ", "User able to enter NPI number");

        //6. Click on Add button
        Assert.assertTrue(npipoObj.clickOnLinkBtn(npipoObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add NPI number");

        //7. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "Credentialing medicare/medicaid/npi has been inserted successfully.";
        Assert.assertEquals(npipoObj.findText(npipoObj.ToastMessageNPI_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of Medicare/Medicaid/NPI", "User is able to add Medicare/Medicaid/NPI successfully");
        System.out.println("Message : " + npipoObj.findText(npipoObj.ToastMessageNPI_xpath));

        Thread.sleep(2000);
        //8. Click on Save & Continue button
        Assert.assertTrue(npipoObj.clickOnLinkBtn(npipoObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");
    }


}
