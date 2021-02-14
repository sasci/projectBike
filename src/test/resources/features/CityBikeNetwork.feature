@RegressionSuite
Feature: Verification of City Bike Networks and Locations.
  @Smoke @Network @Happy
  Scenario:  As a user I should get total network count as 646.
    Given User opens bike project page
    When User calls to all networks
    Then User should see 646 networks

  @Smoke @Happy @Frankfurt
  Scenario: As a user I should verify Frankfurt and locations that it belongs to Germany.
    Given User opens bike project page
    When User calls to "visa-frankfurt" as a network_id
    Then User should see following table

    |city     |country  |latitude   |longitude |
    |Frankfurt|DE       |50.1072    |8.66375   |

    And User should see at least 362 free bikes
    And User should see station count as 96

