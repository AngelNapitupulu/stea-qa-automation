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

WebUI.navigateToUrl('https://workchestra-moonlay.southeastasia.cloudapp.azure.com:4200/eworkbag/job/1167')

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/input_Log in_Input.Username'), 
    '80309001')

WebUI.setEncryptedText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/input_Log in_Input.Password'), 
    'u1JKymZE/SfHAn9XxJys1oLyz6Gnq6KX')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Back Assigned TechniciansRoleTechnician_2a2e55'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/a_CRR Forms'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_PDF_button-animated'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/a_Scrap'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_ConfirmationReason for scrap  Confirm  Close'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/textarea__form-control ng-untouched ng-vali_70069b'), 
    'Component is not serviceable')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_Confirm'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Confirm Scrapping of Component (Router)_ddbecb'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/img_confirm scrapping of component (Router)_b5baad'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Submit Hard Copy Crr  Sign workscope  C_7ce077'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/td_Scrapped  by EmpNo80309001 on 20Dec24'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/span_Scrapped'))

WebUI.closeBrowser()

