Feature: Automated Shoe Ordering Test
  The purpose of this Feature File is to test how to find and item and orden the price

  Scenario: Search for a Puma Shoe brand new and show result
  Given user is in Ebay home page
    When he first clicks in the top centered searchbox
    And he is able to write the word shoes
		Then he press the key Enter another page is loaded
		 But user should not see the homepage 
		When Select status “New with box”
		 Then he should see the page refresh and show results
		 And 	he selects the brand "puma"
		When Print the number of results in console