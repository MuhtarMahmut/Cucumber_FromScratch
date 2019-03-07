$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AllConcepts.feature");
formatter.feature({
  "name": "All Tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@1"
    }
  ]
});
formatter.scenario({
  "name": "Google Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1"
    }
  ]
});
formatter.step({
  "name": "Environemnt is ready",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStep.environemnt_is_ready()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "got to the Website \"https://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStep.got_to_the_Website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search \"Lap-top\" keyword",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStep.search_keyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Test Ended",
  "keyword": "* "
});
formatter.match({
  "location": "SearchStep.test_Ended()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print \"Muhtar\" on the console.",
  "keyword": "But "
});
formatter.match({
  "location": "SearchStep.print_on_the_console(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print \"Mahmut\" on the console.",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.print_on_the_console(String)"
});
formatter.result({
  "status": "passed"
});
});