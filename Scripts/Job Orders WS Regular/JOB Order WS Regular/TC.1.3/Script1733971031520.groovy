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

WebUI.openBrowser(GlobalVariable.baseURL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Back Assigned TechniciansRoleTechnician_aa4470'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Get Involved As Job Order No.80000169MW_b856ec'))

WebUI.delay(5)

WebUI.click(findTestObject('Button/Page_Workchestra/button_Get Involved As'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Button/Page_Workchestra/button_WS'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Confirm your role for Job No 7402818000_a4e0da'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Confirm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Workchestra/div_Assigned TechniciansRoleTechniciansWork_1adb22'), 
    5)

WebUI.closeBrowser()

