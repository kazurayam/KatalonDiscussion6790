import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/6790_testbed.html')

def text = WebUI.getText(findTestObject('Page_sample/div_node_text1'))
WebUI.verifyEqual(text, 'Text 1')


WebUI.closeBrowser()

