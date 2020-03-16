$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Myntra Website",
  "description": "",
  "id": "myntra-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Myntra"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "Login and Search product",
  "id": "myntra-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02_Mytra"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user loggedin to the home page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on down arrow and enter key the user get the searching products",
  "keyword": "Then "
});
formatter.match({
  "location": "Mynta_SearchProduct.user_launch_the_chrome_application()"
});
});