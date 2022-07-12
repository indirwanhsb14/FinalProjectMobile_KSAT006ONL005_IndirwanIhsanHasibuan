import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
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
import com.indirwan.LoopXpath as loopXpath

Mobile.callTestCase(findTestCase('Auth/TC03 - Login Valid'), [('username') : 'wane', ('password') : 'f7IgQFd4qQo='], FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Dashboard/textView_Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.tap(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/MenuBar/btnLi_Make-a-Payment'), 0)

Mobile.tap(findTestObject('Dashboard/MenuBar/btnLi_Make-a-Payment'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/textView_Payment'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/textView_SelectAccount'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/dropdown_Payment'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/textView_SelectPayee'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/setText_Amount'), 0)

Mobile.tap(findTestObject('Payment/setText_Amount'), 0)

Mobile.setText(findTestObject('Payment/setText_Amount'), amount, 0)

Mobile.verifyElementVisible(findTestObject('Payment/btn_MakePayment'), 0)

Mobile.tap(findTestObject('Payment/btn_MakePayment'), 0)

driver.terminateApp(GlobalVariable.apiPackage)

