$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/gap/automation/feature/member_search.feature");
formatter.feature({
  "name": "Perform the basic GAP operations",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MemberView"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in the landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the Enrollment link",
  "keyword": "Then "
});
formatter.step({
  "name": "User cliks on the update/View member link and navigates to member search page",
  "keyword": "Then "
});
formatter.step({
  "name": "User select the \"\u003cPolicy\u003e\" , \"\u003cDivision\u003e\", \"\u003cClass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User provides the Employee \"\u003cFirstName\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Performs the Search Option",
  "keyword": "And "
});
formatter.step({
  "name": "User validates the search results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Policy",
        "Division",
        "Class",
        "FirstName",
        "LastName"
      ]
    },
    {
      "cells": [
        "13622",
        "001",
        "01",
        "GESTYUI",
        "GESTYUI"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MemberView"
    }
  ]
});
formatter.step({
  "name": "The user is in the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.The_user_is_in_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Enrollment link",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_clicks_on_the_Enrollment_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User cliks on the update/View member link and navigates to member search page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_cliks_on_the_update_View_member_link_and_navigates_to_member_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the \"13622\" , \"001\", \"01\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_select_the(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides the Employee \"GESTYUI\" and \"GESTYUI\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_provides_the_Employee_fn_and_ln(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Performs the Search Option",
  "keyword": "And "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_Performs_the_Search_Option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gap.automation.steps.Member_Search_Steps.user_validates_the_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});