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
    WebUI.navigateToUrl(GlobalVariable.URL)
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser(GlobalVariable.URL)
} 

WebUI.delay(1)

WebUI.setText(findTestObject('FPP Online Personal/txtCustomerName'), 'Ronny Marlisa')

WebUI.setText(findTestObject('FPP Online Personal/txtKTP'), '3526747140002')

WebUI.setText(findTestObject('FPP Online Personal/txtAddress'), 'Perumahan Kota Harapan Indah Jl. Taman Heliconia Blok A no. 01')

WebUI.setText(findTestObject('FPP Online Personal/txtRT'), '001')

WebUI.setText(findTestObject('FPP Online Personal/txtRW'), '011')

WebUI.setText(findTestObject('FPP Online Personal/txtMobilePhoneNo'), '081234567890')

WebUI.comment('ZipCode')

WebUI.click(findTestObject('FPP Online Personal/a_ZIPCode'))

WebUI.waitForElementPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.setText(findTestObject('FPP Online Personal/popUpZipCode/txtZipCode'), '17214')

WebUI.click(findTestObject('FPP Online Personal/popUpZipCode/btn_Search'))

WebUI.waitForElementPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.click(findTestObject('FPP Online Personal/popUpZipCode/span_FoundFirst'))

WebUI.click(findTestObject('FPP Online Personal/popUpZipCode/btn_Choose'))

WebUI.delay(1)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDateItem_plus1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTime'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTimeItem_09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/chk_Agree'))

WebUI.click(findTestObject('FPP Online Personal/btn_Submit'))

WebUI.click(findTestObject('FPP Online Personal/btn_PopUpCancel'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

