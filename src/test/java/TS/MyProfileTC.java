package TS;


import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.MyProfilePO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProfileTC extends BaseTest {
    public MyProfileTC() {
    }

    public MyProfileTC(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void verifyProfilePageSLT() throws InterruptedException {
        //******************************"Pre-condition : Login Require******************//
        LoginTC loginpage = new LoginTC(driver);
        loginpage.VerifyLoginSLT();

        //********************Reading data from Read From Prop File****************************//
        MyProfilePO profilePOObj = new MyProfilePO(driver);
        ReadFromPropFile readFromPropFilePPObj = new ReadFromPropFile("RegiProfileConfig.properties");

        //**********************************Profile and EditPage************************************//
        ExtentTestManager.getTest().getTest().setName("SMT-002: Verify My Profile");
        // 1. Click dropdown arrow  on profile user
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.DropDown_xpath), "Unable to click on dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sign In button ", "User able to click on sign in button");

        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.MyProfile_xpath), "Unable to click on my profile tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on user name dropdown ", "User able to click on username dropdown button");

        //2. Click ""Edit profile"" button
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.EditProfile_xpath), "Unable to click on edit profile tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on edit profile tab ", "User able to click on edit profile tab ");

        //3.Click Browse for Upload CV
        Assert.assertTrue(profilePOObj.imageUpLoadPDF(profilePOObj.UploadCV_xpath), "Unable to click on Upload CV");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on upload CV ", "User able to upload CV");

        //4.Click Browse for Upload profile photo
        Assert.assertTrue(profilePOObj.imageUpLoad(profilePOObj.ProfilePho_xpath), "Unable to click to Upload profile photo");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on profile photo", "User able to upload profile photo");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");

        //5.Enter address
        Assert.assertTrue(profilePOObj.enterTextInInputBtn(profilePOObj.HAdd_xpath, readFromPropFilePPObj.getAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(profilePOObj.enterTextInInputBtn(profilePOObj.HCity_xpath, readFromPropFilePPObj.getCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //6.Select state from drop down
        Assert.assertTrue(profilePOObj.selectFromDropDownBtn(profilePOObj.HState_xpath, profilePOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        Assert.assertTrue(profilePOObj.enterTextInInputBtn(profilePOObj.Zip_xpath, readFromPropFilePPObj.getZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //7.Select option Yes for Citizenship
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.Citizenship_xpath), "Unable to click on citizenship");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on citizenship as yes", "User able to select citizenship ");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

        //8.Select specialty
        Assert.assertTrue(profilePOObj.selectFromDropDownBtn(profilePOObj.Specialty_xpath, profilePOObj.SpecDropDwn_xpath), "Unable to select specialty");
        ExtentTestManager.getTest().log(LogStatus.PASS, "select specialty ", "User able to select specialty ");

        //9.Select subspecialty
        Assert.assertTrue(profilePOObj.selectFromDropDownBtn(profilePOObj.SubSp_xpath, profilePOObj.SubSpDropDwn_xpath), "Unable to select subspecialty");
        ExtentTestManager.getTest().log(LogStatus.PASS, "select subspecialty ", "User able to select subspecialty ");

        //10.Select option Yes for Board Eligible
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.BoardElig_xpath), "Unable to click on board eligible");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on board eligible", "User able to click on board eligible ");

        //11.Select skills
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.AddSkills_xpath), "Unable to click on Add Skills");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on add skills", "User able to click on add skills");

        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.SkillsChkList_xpath), "Unable to select checklist skills");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on checklist skills", "User able to click on checklist skills");

        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.SkillsChkList1_xpath), "Unable to select skills1");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on checklist skills1", "User able to click on checklist skills1");

        //  Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.SkillsChkList2_xpath), "Unable to select skills2");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on checklist skills2", "User able to click on checklist skills2");

        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.SkillsChkList3Add_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on add button", "User able to click on add button");

        Thread.sleep(2000);
        //12.Click + button
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.SkillsPlusSign_xpath), "Unable to click on plus button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on plus button", "User able to click on plus button");

        //13.Select Degree
        Assert.assertTrue(profilePOObj.selectDropDown(profilePOObj.SelectDegree_xpath, profilePOObj.SelectDegree1_xpath, profilePOObj.SelectDegree2_xpath), "Unable to select degree CRNA, RN");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on select degrees", "User able to select multiple degrees");

        //14.Select state license
        Thread.sleep(2000);
        Assert.assertTrue(profilePOObj.selectDropDown(profilePOObj.StateLicense_xpath, profilePOObj.State1_xpath, profilePOObj.State2_xpath), "Unable to click on District of Columbia state license");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on license", "User able to select multiple state license");

        /*//15.Select Yes option for DEA
         Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.DEA_xpath), "Unable to click to enable DEA toggle button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on DEA", "User able to click on enable DEA");
*/
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");

        //16.Select schedule availability date
        Thread.sleep(2000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAva_xpath), "Unable to click on From Date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on from date ", "User able to click on from date");

        Thread.sleep(1000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaFromDt_xpath), "Unable to click on next month arrow");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select next month arrow", "User able to select next month arrow");

        Thread.sleep(1000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaFromDt2_xpath), "Unable to select date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select date", "User able to click on to select date");

        /*//selection of unchecking 'no end date'
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleNoEndDt_xpath), "Unable to click on 'No End Date'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'No End Date' option ", "User able to click on to uncheck 'No End Date' option");
*/
        //Selecting To date
        Thread.sleep(2000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaToDt_xpath), "Unable to click on To Date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on To Date ", "User able to click on To Date");

        Thread.sleep(1000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaToDt1_xpath), "Unable to click on next month arrow");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select next month arrow", "User able to select next month arrow");

        Thread.sleep(1000);
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaToDt2_xpath), "Unable to select date May 10th");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select date", "User able to click on to pick date");

        //17.Select + button
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.ScheduleAvaPlusSign_xpath), "Unable to Click on plus sign");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to add the date", "User able to add the date successfully");

        //18.Click Save button
        Assert.assertTrue(profilePOObj.clickOnLinkBtn(profilePOObj.Save_xpath), "Unable to save profile record");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to save profile record", "User able to save profile record successfully");
    }
}


