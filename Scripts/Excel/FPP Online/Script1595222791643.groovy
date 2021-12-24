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

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDateItem_plus1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTime'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTimeItem_09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/chk_Agree'))

WebUI.click(findTestObject('FPP Online Personal/btn_Submit'))

WebUI.click(findTestObject('FPP Online Personal/btn_PopUpOk'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

