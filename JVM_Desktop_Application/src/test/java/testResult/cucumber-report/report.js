$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DesktopApp.feature");
formatter.feature({
  "line": 1,
  "name": "DesktopApp",
  "description": "",
  "id": "desktopapp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 882226028,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the Addition of two number",
  "description": "",
  "id": "desktopapp;verify-the-addition-of-two-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Click on First Number",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Add Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Second Number",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Equal Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Observe Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Desktop_App.clickFirstNumber()"
});
formatter.result({
  "duration": 5729789315,
  "status": "passed"
});
formatter.match({
  "location": "Desktop_App.clickPlusbutton()"
});
formatter.result({
  "duration": 602305697,
  "status": "passed"
});
formatter.match({
  "location": "Desktop_App.clickSecondNumber()"
});
formatter.result({
  "duration": 617267547,
  "status": "passed"
});
formatter.match({
  "location": "Desktop_App.clickEqualbutton()"
});
formatter.result({
  "duration": 608620142,
  "status": "passed"
});
formatter.match({
  "location": "Desktop_App.observeresult()"
});
formatter.result({
  "duration": 118095339,
  "status": "passed"
});
});