$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginfunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Verify login functionality",
  "description": "I want to use this template for my feature file",
  "id": "verify-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "To Test Login Page",
  "description": "",
  "id": "verify-login-functionality;to-test-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginPage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify the title of the page",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "verify-login-functionality;to-test-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "verify-login-functionality;to-test-login-page;;1"
    },
    {
      "cells": [
        "chatterjeeamit41@gmail.com",
        "Testing12345$"
      ],
      "line": 15,
      "id": "verify-login-functionality;to-test-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "To Test Login Page",
  "description": "",
  "id": "verify-login-functionality;to-test-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginPage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter username \"chatterjeeamit41@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"Testing12345$\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify the title of the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageTest.launch_the_browser()"
});
formatter.result({
  "duration": 36801514300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_click_on_log_in_button()"
});
formatter.result({
  "duration": 6032455200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chatterjeeamit41@gmail.com",
      "offset": 18
    }
  ],
  "location": "LoginPageTest.i_enter_username(String)"
});
formatter.result({
  "duration": 5771101700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing12345$",
      "offset": 18
    }
  ],
  "location": "LoginPageTest.i_enter_password(String)"
});
formatter.result({
  "duration": 5609505900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_click_on_login_button()"
});
formatter.result({
  "duration": 5364975500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_verify_the_title_of_the_page()"
});
formatter.result({
  "duration": 24403184600,
  "status": "passed"
});
});