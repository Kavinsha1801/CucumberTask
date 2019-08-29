$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/1dlist.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Add a customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "addCustomer.launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Addd customer link",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.click_the_Addd_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add customer details",
  "rows": [
    {
      "cells": [
        "kavin",
        "raj",
        "kavin@gmail.com",
        "pondy",
        "81222123321"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "addCustomer.add_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "generate the customer id and display",
  "keyword": "Then "
});
formatter.match({
  "location": "addCustomer.generate_the_customer_id_and_display()"
});
formatter.result({
  "status": "passed"
});
});