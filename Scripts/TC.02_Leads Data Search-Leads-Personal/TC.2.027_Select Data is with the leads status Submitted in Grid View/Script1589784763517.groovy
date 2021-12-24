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

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'agus')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/a_LeadsDataSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsID'), '202005')

not_run: WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsName'), 'Winarsih')

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddl_CustomerStatus'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlCustomerStatus_New'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddl_CustomerType'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlCustomerType_Personal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddl_LeadsStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_LeadsStatus_SubmitLDI'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddl_SurveyStatus'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlSurveyStatus_LossData'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsDateFrom'), '23/03/2020')

not_run: WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsDateTo'), '30/05/2020')

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddl_DataType'))

not_run: WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlDataType_Leads'))

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/a_SearchButton'))

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_FoundFirstData'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

