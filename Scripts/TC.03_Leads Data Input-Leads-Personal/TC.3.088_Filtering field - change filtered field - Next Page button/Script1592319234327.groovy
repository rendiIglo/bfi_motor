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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'agus')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_LeadsDataInput'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlSubBranch_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlGeraiInput_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlProduct_NDF Motor'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Personal Info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), 'Rifkai')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), '1234567891234570')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), '08128332026')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), 'rifka@gmail.com')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), '15/02/1950')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGenderFemale'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_MaritalStatusType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlMaritalStatus_Single'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMotherMaidenName'), 'Sukasih')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Address Tab')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtAddress'), 'Perumahan kota harapan Indah No.45')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRT'), '009')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRW'), '009')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddl_Province'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddlProvinceItem/span_ddlProvince_Sumatera Utara'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_ZIPCode'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), '20131')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_Asam Kumbang'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.comment('Documents')

WebUI.delay(1)

WebUI.comment('upload KTP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_ektp'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), '25')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), 'null')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), '12/12/2020')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\ndf-motor-personal\\KTP.png')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('NPWP')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_NPWP'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), '25')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), 'null')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), '12/12/2020')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\ndf-motor-personal\\NPWP.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('SIM')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_SIM'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), '25')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), 'null')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), '12/12/2020')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\ndf-motor-personal\\SIM.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('STNK & BPKB Mobil')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_NextPage'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 20)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.focus(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_title_documentchecklist'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_STNK_BPKB Mobil'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), '25')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), 'null')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), '12/12/2020')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\ndf-motor-personal\\stnkbpkbmobil.png')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.comment('Lead Detail')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuLeadDetail'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_Activity'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlActivityItem/span_ddlActivity_Direct selling'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlFinancePurposeItem/span_ddlFinancePurpose_Productive'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtManufacturingYear'), 
    '2012')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
    'B 1454 NE')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_New-RO-Take Over'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    'BAJAJ-PULSAR135-LS')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    'Toyota')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_NextPage'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

