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

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.url_dev)

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Page Pengelola Pasar/Login/input_username'), username_pengelola_jatijajar)

WebUI.setText(findTestObject('Page Pengelola Pasar/Login/input_password'), password_pengelola_jatijajar)

WebUI.delay(2)

WebUI.click(findTestObject('Page Pengelola Pasar/Login/button_login'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Logout/button_logout'))

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Logout/confirm_logout'))

WebUI.closeBrowser()


