$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dropdown.feature");
formatter.feature({
  "line": 1,
  "name": "Droppdown  Functionality",
  "description": "As user i like to check droppdown functionality of Next Up field",
  "id": "droppdown--functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23754395100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Spotlight Test Ticket - Varify KBO sport list  Functionality",
  "description": "",
  "id": "droppdown--functionality;spotlight-test-ticket---varify-kbo-sport-list--functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@t1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on home page of pickswise",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on accpet cookies",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on All Sports button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I  can see an available list of valid Sports to filter by",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can click KBO sport from droppdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see all KBO sports list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePageOfPickswise()"
});
formatter.result({
  "duration": 453069700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAccpetCookies()"
});
formatter.result({
  "duration": 271917700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAllSportsButton()"
});
formatter.result({
  "duration": 366340600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCanSeeAnAvailableListOfValidSportsToFilterBy()"
});
formatter.result({
  "duration": 412956800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCanClickKBOSportFromDroppdown()"
});
formatter.result({
  "duration": 230009000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeAllKBOSportsList()"
});
formatter.result({
  "duration": 206220600,
  "status": "passed"
});
formatter.after({
  "duration": 122100,
  "status": "passed"
});
});