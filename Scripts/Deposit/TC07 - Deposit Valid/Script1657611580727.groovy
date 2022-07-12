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

Mobile.callTestCase(findTestCase('Auth/TC09 - Login Valid 2'), [('username') : 'kale', ('password') : '4j5Q3BbpYYE='], 
    FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Dashboard/textView_Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.tap(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/MenuBar/btnLi_Make-a-Deposit'), 0)

Mobile.tap(findTestObject('Dashboard/MenuBar/btnLi_Make-a-Deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/btn_Add'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/dropdown_deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/textView_Deposit'), 0)

Mobile.tap(findTestObject('Deposit/dropdown_deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/dropdown_Li1'), 0)

Mobile.tap(findTestObject('Deposit/dropdown_Li1'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/setText_EnterDeposit'), 0)

Mobile.tap(findTestObject('Deposit/setText_EnterDeposit'), 0)

Mobile.setText(findTestObject('Deposit/setText_EnterDeposit'), deposit, 0)

Mobile.verifyElementVisible(findTestObject('Deposit/btn_Cancel'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/btn_Add'), 0)

Mobile.tap(findTestObject('Deposit/btn_Add'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/textView_Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/viewText_AccountBalance'), 0)

driver.terminateApp(GlobalVariable.apiPackage)

