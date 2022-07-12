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

Mobile.verifyElementVisible(findTestObject('Dashboard/imgView_Logo'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.tap(findTestObject('Dashboard/imgbtn_MenuBar'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/MenuBar/btnLi_Accounts'), 0)

Mobile.tap(findTestObject('Dashboard/MenuBar/btnLi_Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/textView_Accounts'), 0)

Mobile.tap(findTestObject('Accounts/imgbtn_AddAccounts'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Add Account/textView_Add_an_Account'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Add Account/setText_AccountName'), 0)

Mobile.tap(findTestObject('Accounts/Add Account/setText_AccountName'), 0)

Mobile.setText(findTestObject('Accounts/Add Account/setText_AccountName'), accountname, 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Add Account/setText_InitialBalance-optional'), 0)

Mobile.tap(findTestObject('Accounts/Add Account/setText_InitialBalance-optional'), 0)

Mobile.setText(findTestObject('Accounts/Add Account/setText_InitialBalance-optional'), initialbalance, 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Add Account/btn_Cancel'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Add Account/btn_Add'), 0)

Mobile.tap(findTestObject('Accounts/Add Account/btn_Add'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)


Integer index = 1

String xpath = '\n//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ListView[1]/android.view.ViewGroup[\n'
String xpath2 = ']'
String fullXpath = (xpath + index) + xpath2

def testObject = loopXpath.getTestObjectWithXpath(fullXpath)
boolean flag = true

while (flag) {
    
    if (!(Mobile.verifyElementExist(testObject, 0, FailureHandling.OPTIONAL))) {
        flag = false
        break
    }
    if (!(Mobile.verifyElementExist(loopXpath.getTestObjectWithXpath((xpath + (index + 1)) + xpath2), 0, FailureHandling.OPTIONAL))) {
        flag = false
        break
    }   
    index += 1
    fullXpath = ((xpath + index) + xpath2)
    testObject = loopXpath.getTestObjectWithXpath(fullXpath)
}

driver.terminateApp(GlobalVariable.apiPackage)


