$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/programs_eclipse/CucumberBDDFramework/src/main/java/Features/createContact.feature");
formatter.feature({
  "line": 2,
  "name": "Demo website login feature",
  "description": "",
  "id": "demo-website-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Demo website login test scenario",
  "description": "",
  "id": "demo-website-login-feature;demo-website-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of login page is Guru99 Bank Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters login credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "mngr262421",
        "EsUmEtY"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on New Customer tab",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enter required information and creates contact",
  "rows": [
    {
      "cells": [
        "Name",
        "DOB",
        "Address",
        "City",
        "State",
        "Pin",
        "Mobile",
        "Email",
        "Password"
      ],
      "line": 15
    },
    {
      "cells": [
        "ABC",
        "06-07-1996",
        "Pimpri",
        "Pune",
        "Maharashtra",
        "411013",
        "9878988878",
        "bingo23@gmail.com",
        "Test@123"
      ],
      "line": 16
    },
    {
      "cells": [
        "XYZ",
        "12-07-1996",
        "Pimpri",
        "Pune",
        "Maharashtra",
        "411013",
        "9878988879",
        "bingo24@gmail.com",
        "Test@456"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepDefinition.User_is_already_on_the_login_page()"
});
formatter.result({
  "duration": 76843611000,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.Title_of_login_page_is_Guru99_Bank_Home_Page()"
});
formatter.result({
  "duration": 17806300,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.User_enters_login_credentials(DataTable)"
});
formatter.result({
  "duration": 330716600,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.User_clicks_login_button()"
});
formatter.result({
  "duration": 2807983700,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.User_is_on_home_page()"
});
formatter.result({
  "duration": 24258900,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.User_clicks_on_New_Customer_tab()"
});
formatter.result({
  "duration": 1629638800,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.User_enter_required_information_and_creates_contact(DataTable)"
});
formatter.result({
  "duration": 11911956700,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 516802200,
  "status": "passed"
});
});