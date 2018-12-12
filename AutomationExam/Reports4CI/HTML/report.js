$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EbayShoeOrdering_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Automated Shoe Ordering Test",
  "description": "The purpose of this Feature File is to test how to find and item and orden the price",
  "id": "automated-shoe-ordering-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for a Puma Shoe brand new and show result",
  "description": "",
  "id": "automated-shoe-ordering-test;search-for-a-puma-shoe-brand-new-and-show-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in Ebay home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he first clicks in the top centered searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "he is able to write the word shoes",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he press the key Enter another page is loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should not see the homepage",
  "keyword": "But "
});
formatter.step({
  "line": 10,
  "name": "Select status “New with box”",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he should see the page refresh and show results",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "he selects the brand \"puma\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Print the number of results in console",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_is_in_Ebay_home_page()"
});
formatter.result({
  "duration": 26197861239,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_first_clicks_in_the_top_centered_searchbox()"
});
formatter.result({
  "duration": 349801300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_is_able_to_write_the_word_shoes()"
});
formatter.result({
  "duration": 46017679,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_press_the_key_Enter_another_page_is_loaded()"
});
formatter.result({
  "duration": 162206202,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_not_see_the_homepage()"
});
formatter.result({
  "duration": 10118110529,
  "status": "passed"
});
formatter.match({
  "location": "Steps.select_status_New_with_box()"
});
formatter.result({
  "duration": 8617632700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_should_see_the_page_refresh_and_show_results()"
});
formatter.result({
  "duration": 107963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "puma",
      "offset": 22
    }
  ],
  "location": "Steps.he_selects_the_brand(String)"
});
formatter.result({
  "duration": 2964854454,
  "status": "passed"
});
formatter.match({
  "location": "Steps.print_the_number_of_results_in_console()"
});
formatter.result({
  "duration": 122440,
  "status": "passed"
});
});