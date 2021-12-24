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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
    WebUI.navigateToUrl(GlobalVariable.URL)
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.URL)
} 

WebUI.setText(findTestObject('Workspace/input_Username'), GlobalVariable.workspaceUsername)

WebUI.setText(findTestObject('Workspace/input_Password'), GlobalVariable.workspacepassword)

WebUI.click(findTestObject('Workspace/a_Login'))

WebUI.navigateToUrl(GlobalVariable.workspaceURL)

WebUI.delay(10)

if (WebUI.verifyElementPresent(findTestObject('Workspace/popUp_K2Tour'), 10, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Workspace/a_stopWalkthru'))
}

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Workspace/a_Inbox'))

WebUI.setText(findTestObject('Workspace/txtSearch'), LeadsIDWorkspace)

WebUI.sendKeys(findTestObject('Workspace/txtSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Workspace/span_FirstData'), 10)

WebUI.delay(4)

WebUI.click(findTestObject('Workspace/span_FirstData'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Workspace/ddl_Action'), 10)

WebUI.click(findTestObject('Workspace/ddl_Action'))

WebUI.waitForElementPresent(findTestObject('Workspace/span_ddlAction_Response'), 20)

WebUI.click(findTestObject('Workspace/span_ddlAction_Response'))

WebUI.click(findTestObject('Workspace/a_submit'))

WebUI.delay(5)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.delay(5)

