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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://workchestra-moonlay.southeastasia.cloudapp.azure.com:4200/Identity/Login')

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Username'), '80309000')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Password'), 'u1JKymZE/SfHAn9XxJys1oLyz6Gnq6KX')

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/app-sidebar-nav-link-content_Job Orders'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Workchestra/select_Any Status Not Started  Job Started _00b861'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/Page_Workchestra/a_-_action cil-spreadsheet'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Get Involved As'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_WS'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Start Job'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/label_CAA Philippines (134-F)'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Declare Compliance'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/a_Work Stages'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Start'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Set reference'))

WebUI.setText(findTestObject('Object Repository/Page_Workchestra/input_Page Reference_workstageReferenceInput'), '3834000-22')

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Add Defect Rectification'))

WebUI.setText(findTestObject('Object Repository/Page_Workchestra/textarea_DefectWork to be Carried Out_works_dbf6d0'), 'Data-data seperti nomor referensi salah')

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_RectificationAction Taken'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Complete'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Confirm and Sign Work Stage Completion _4ae611'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/img_Created_cursor-pointer'))

WebUI.closeBrowser()
