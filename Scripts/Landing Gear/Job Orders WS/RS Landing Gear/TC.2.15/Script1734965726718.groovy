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

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/a_CRR Forms'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_PDF_button-animated'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/a_Add Rework Worksheet'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_Rework Worksheets No_form-control ng-_e090e2'), 
    'r')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/span_RW32-11-10002'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_Job No_jobno-rwws'), '002')

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_Repair No_repairno-rwws'), '00323')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Part Numbers'))

//WebUI.sendKeys(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Part Numbers'), Keys.chord(Keys.ARROW_DOWN, 
//      Keys.ENTER))
WebUI.click(findTestObject('WSnonAChold LG/RS/Page_Workchestra/span_MinhTestPart1'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_Repair Scope_repairscope-rwws'), 
    '')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Choose Index_ng-input'))

WebUI.click(findTestObject('WSnonAChold LG/RS/Page_Workchestra/span_Index Page'))

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_CMM_cmm-rwws'), '112')

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/input_Serial No_serial-rwws'), '2232')

WebUI.setText(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/textarea_Comments_comments_rwws'), 'Filled in')

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/button_Add'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Success  Rework Worksheet RW32-11-10002_77ae3d'))

WebUI.click(findTestObject('Object Repository/WSnonAChold LG/RS/Page_Workchestra/div_Success'))

WebUI.closeBrowser()

