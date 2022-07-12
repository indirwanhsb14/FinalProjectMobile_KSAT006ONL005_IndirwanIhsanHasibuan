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

WebUI.callTestCase(findTestCase('Login/TC03 - Login Valid'), [('username') : 'wane', ('password') : 'f7IgQFd4qQo='], FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.tap(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/MenuBar/btnLi_Accounts'), 0)

//----------------------------------------------------------------------------------

String accountBalance = Mobile.getText(findTestObject('Accounts/viewText_AccountBalance'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/MenuBar/btnLi_Make-a-Deposit'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Deposit/textView_Deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/dropdown_deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/dropdown_Li1'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/setText_EnterDeposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/btn_Cancel'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/btn_Add'), 0)

Mobile.tap(findTestObject('Deposit/dropdown_deposit'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.verifyElementVisible(findTestObject('Deposit/dropdown_Li1'), 0)

Mobile.tap(findTestObject('Deposit/dropdown_Li1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Deposit/setText_EnterDeposit'), deposit, 0)

Mobile.tap(findTestObject('Deposit/btn_Add'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.verifyElementVisible(findTestObject('Accounts/textView_Accounts'), 0)

// ---------------------------------------------------------------------------------------------

String[] accountBalanceNow = accountBalance.split('(?<=\\D)(?=\\d)')

Integer accountBalanceTot = (accountBalanceNow[1]).replace('.', '').toInteger()

Integer inputBalanceTot = deposit.toInteger()

Integer updatedBalanceTot = accountBalanceNow + inputBalanceTot

String updatedBalanceNow = ((accountBalanceNow[0]) + updatedBalanceTot.toString()) + '.00'

Mobile.verifyElementText(findTestObject('Accounts/viewText_AccountBalance'), updatedBalanceNow)

driver.terminateApp(GlobalVariable.apiPackage)

