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

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Add Defect Rectification'))

WebUI.setText(findTestObject('Object Repository/Page_Workchestra/textarea_DefectWork to be Carried Out_works_dbf6d0'), 'Data-data seperti nomor referensi salah\n')

WebUI.setText(findTestObject('Object Repository/Page_Workchestra/textarea_RectificationAction Taken_workstag_7c2e77'), 'Mengisi ulang no. referensi dengan melihat data sebenernya')

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Save'))

WebUI.closeBrowser()

