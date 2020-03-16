$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Guru99.feature");
formatter.feature({
  "line": 2,
  "name": "Guru99 website",
  "description": "",
  "id": "guru99-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@guru99_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Learn cucumber framework with the help of guru99 website",
  "id": "guru99-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_guru99"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user opens guru99 homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "selects cucumber testing from testing list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should navigate to cucumber tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "guru99_Steps.the_user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 11914677500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 19
    }
  ],
  "location": "guru99_Steps.the_user_opens_guru_homepage(int)"
});
formatter.result({
  "duration": 3345858300,
  "status": "passed"
});
formatter.match({
  "location": "guru99_Steps.selects_cucumber_testing_from_testing_list()"
});
formatter.result({
  "duration": 12133324900,
  "status": "passed"
});
formatter.match({
  "location": "guru99_Steps.the_user_should_navigate_to_cucumber_tutorial()"
});
formatter.result({
  "duration": 3253050600,
  "status": "passed"
});
});