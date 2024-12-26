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

WebUI.navigateToUrl('https://workchestra-moonlay.southeastasia.cloudapp.azure.com:4200/eworkbag/job/1136')

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/input_Log in_Input.Username'), 
    '80309001')

WebUI.setEncryptedText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/input_Log in_Input.Password'), 
    'u1JKymZE/SfHAn9XxJys1oLyz6Gnq6KX')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Back Assigned TechniciansRoleTechnician_43613f'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/td_1. Preliminary Inspection'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_Amend'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Update Reference Update reference under_98c2c9'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_checkbox'), '3834000-100')

WebUI.selectOptionByValue(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/select_Typo Error  Missing Field  For Furth_ac932f'), 
    'Missing Field', true)

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_Update'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Confirm and Sign Amendment Please place_5b1a23'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/img_confirm scrapping of component (Router)_b5baad'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/span_Amended by RS'))

WebUI.closeBrowser()

