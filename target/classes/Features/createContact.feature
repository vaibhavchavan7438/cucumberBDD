
Feature: Demo website login feature

Scenario: Demo website login test scenario

Given User is already on the login page
When Title of login page is Guru99 Bank Home Page
Then User enters login credentials
| username | password |
| mngr262421 |EsUmEtY | 
Then User clicks login button
Then User is on home page
Then User clicks on New Customer tab
Then User enter required information and creates contact
| Name | DOB | Address | City | State | Pin | Mobile | Email | Password |
| ABC | 06-07-1996 | Pimpri | Pune | Maharashtra | 411013 | 9878988878 | bingo23@gmail.com | Test@123 |
| XYZ | 12-07-1996 | Pimpri | Pune | Maharashtra | 411013 | 9878988879 | bingo24@gmail.com | Test@456 |
Then close the browser
