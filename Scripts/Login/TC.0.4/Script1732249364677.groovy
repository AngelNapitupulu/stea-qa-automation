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

WebUI.navigateToUrl('https://workchestra-moonlay.southeastasia.cloudapp.azure.com:4200/Identity/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DWorkchestraWeb%26redirect_uri%3Dhttps%253A%252F%252Fworkchestra-moonlay.southeastasia.cloudapp.azure.com%253A4200%252Fauthentication%252Flogin-callback%26response_type%3Dcode%26scope%3DWorkchestraWebAppAPI%2520openid%2520profile%26state%3De258adebf06e44c08e677ea649d1e236%26code_challenge%3DaRqN0m8QahGxqEA-B1owvlFtIjztUA0ig7nuKPffbiQ%26code_challenge_method%3DS256%26response_mode%3Dquery')

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/div_Log in'))

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Username'))

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/div_The Username field is required.        _07e32a'))

WebUI.closeBrowser()

