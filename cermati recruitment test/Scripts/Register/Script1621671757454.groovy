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

WebUI.navigateToUrl('https://www.cermati.com/gabung')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__email'), 'marcel183@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__password'), 
    'BakLU4D3gbKfgBGAnHX/AA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__confirmPassword'), 
    'oXhGsgb9iGrkQ7HO/V/lOw==')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__firstName'), 'marcel')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__lastName'), 'siahaan')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__mobilePhone'), 
    '087884421788')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__residenceCity'), 
    'bekasi')

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_KOTA BEKASI'))

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/button_Daftar Akun'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_Selamat Datang di Cermati'), 
    'Selamat Datang di Cermati!')

WebUI.navigateToUrl('https://www.cermati.com/')

WebUI.closeBrowser()

