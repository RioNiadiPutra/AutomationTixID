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

Mobile.startExistingApplication('id.tix.android')

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Daftar Akun/Negatif/android.widget.ImageView (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Daftar Akun/Negatif/android.widget.Button - Masuk atau Daftar Akun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Daftar Akun/Negatif/android.widget.Button - Daftar Sekarang'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Daftar Akun/Negatif/android.widget.EditText - Masukkan nama Anda (1)'), 
    '', 0)

Mobile.verifyElementText(findTestObject('Daftar Akun/Negatif/android.widget.TextView - Kolom WAJIB diisi'), 'Kolom WAJIB diisi')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Daftar Akun/Negatif/android.widget.EditText - Masukkan nomor handphone'), 
    '87888705908', 0)

Mobile.takeScreenshot('D:\\Project\\TixID\\m-TixID\\Screenshoot\\Daftar Akun\\screenshootnegatif(1)daftarakun.png')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

