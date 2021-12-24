import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://uat-los.bfi.co.id/los/')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://uat-los.bfi.co.id/los/')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), GlobalVariable.usernameAdminVer)

WebUI.setText(findTestObject('Login/input_Username_Password'), GlobalVariable.passwordAdminVer)

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Admin Verification'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AdminVer Personal/ddl_SearchBy'))

WebUI.click(findTestObject('AdminVer Personal/span_ddlSearchBy_Leads ID'))

WebUI.setText(findTestObject('AdminVer Personal/txtLeadsID'), LeadsIDAdminVer)

WebUI.sendKeys(findTestObject('AdminVer Personal/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.click(findTestObject('AdminVer Personal/ddlProduct'))

WebUI.click(findTestObject('AdminVer Personal/ddlProductItem/itemNDFMotor'))

WebUI.click(findTestObject('AdminVer Personal/ddlCustomerType'))

WebUI.click(findTestObject('AdminVer Personal/ddlCustomerTypeItem/itemPersonal'))

WebUI.click(findTestObject('AdminVer Personal/btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('AdminVer Personal/SpanFoundFirst'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 240)

WebUI.delay(1)

WebUI.click(findTestObject('AdminVer Personal/Detail/Document Checklist/data/divCustomer'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('AdminVer Personal/Detail/Document Checklist/data/Customer/chkUnmatchCustomerName'))

not_run: WebUI.click(findTestObject('AdminVer Personal/Detail/Document Checklist/data/Customer/chkUnmatchMobilePhone1'))

not_run: WebUI.setText(findTestObject('AdminVer Personal/Detail/Document Checklist/data/Customer/txtCustomerName'), 'Rifkayi')

not_run: WebUI.setText(findTestObject('AdminVer Personal/Detail/Document Checklist/data/Customer/txtMobilePhone1'), '081234567890')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AdminVer Personal/Detail/Document Checklist/data/divLeadDetail'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 4)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 8)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('AdminVer Personal/Detail/Document Checklist/data/LeadDetail/btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

