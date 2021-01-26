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

"---MULAI LOGIN---"
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.navigateToUrl('https://pengelola-pasar.tcd-dev.id/')

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Page Pengelola Pasar/Login/input_username'), 'admpengelolajatijajar')

WebUI.setEncryptedText(findTestObject('Page Pengelola Pasar/Login/input_password'), 'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.delay(2)

WebUI.click(findTestObject('Page Pengelola Pasar/Login/button_login'))

WebUI.waitForPageLoad(3)
"---SELESAI LOGIN---"


"---CEK MENU---"
WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_dashboard'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_profil_pedagang'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_profil_lapak'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_transaksi'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_daftar_kategori'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_daftar_omzet'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_ongkir'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_profile'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_banner'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_visualisasi'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_ubah_password'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_setting_manajemen_user'))
WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Menu/menu_bantuan'))
WebUI.waitForPageLoad(3)
"---SELESAI CEK MENU---"


"---LOGOUT---"
WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Logout/button_logout'))

WebUI.click(findTestObject('Object Repository/Page Pengelola Pasar/Logout/confirm_logout'))
"---SELESAI LOGOUT---"

WebUI.closeBrowser()


