$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestCase.Feature");
formatter.feature({
  "line": 2,
  "name": "Task_Management Website",
  "description": "",
  "id": "task-management-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Task_Management"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Login into Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01_Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Clicking on Administration to nagivate Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_LoginStep.the_user_launch_the_chrome_application()"
});
});