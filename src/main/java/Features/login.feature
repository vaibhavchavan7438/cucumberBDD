#NORMAL
#Feature: Demo website login feature
#
#Scenario: Demo website login test scenario
#
#Given User is already on the login page
#When Title of login page is Guru99 Bank Home Page
#Then User enters username and password  #pass directly through stepDefinition(Hard coded--> not recommanded)
#Then User clicks login button
#Then User is on home page
#Then close the browser




#PASSING CREDENTIALS WITHOUT EXAMPLES
#Feature: Demo website login feature
#
#Scenario: Demo website login test scenario
#
#Given User is already on the login page
#When Title of login page is Guru99 Bank Home Page
#Then User enters "mngr252782" and "qarYrEp"      ---> Need to pass \"(.*)\" while writing @Then annotations in place of username and password
#Then User clicks login button
#Then User is on home page
#Then close the browser

#EXAMPLES
Feature: Demo website login feature

Scenario Outline: Demo website login test scenario

Given User is already on the login page
When Title of login page is Guru99 Bank Home Page
Then User enters "<username>" and "<password>"
Then User clicks login button
Then User is on home page
Then close the browser
Examples:
  | username | password |
  | mngr262421 | EsUmEtY |
  | mngr262421 | EsUmEtY |
  
  
 #TABLE 
#Feature: Demo website login feature
#
#Scenario: Demo website login test scenario
#
#Given User is already on the login page
#When Title of login page is Guru99 Bank Home Page
#Then User enters username and password
 #| mngr255764 | dAsyged |
 #| mngr255764 | dAsyged |
#Then User clicks login button
#Then User is on home page
#Then close the browser
  