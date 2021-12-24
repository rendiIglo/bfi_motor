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

WebUI.click(findTestObject('FPP Online Personal/a_ZIPCode'))

WebUI.waitForElementPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.setText(findTestObject('FPP Online Personal/popUpZipCode/txtZipCode'), '11480')

WebUI.setText(findTestObject('FPP Online Personal/popUpZipCode/txtKelurahan'), 'Kemanggisan')

WebUI.setText(findTestObject('FPP Online Personal/popUpZipCode/txtCity'), 'Jakarta barat')

WebUI.setText(findTestObject('FPP Online Personal/popUpZipCode/txtKecamatan'), 'Palmerah')

WebUI.click(findTestObject('FPP Online Personal/popUpZipCode/btn_Search'))

WebUI.waitForElementPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('FPP Online Personal/divLoadingRuntimePopUp'), 10)

WebUI.click(findTestObject('FPP Online Personal/popUpZipCode/span_FoundFirst'))

not_run: WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()
