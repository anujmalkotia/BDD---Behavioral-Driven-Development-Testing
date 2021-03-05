@tag
Feature: One Way Trip Goibibo

  @tag1
  Scenario Outline: Booking One Way Trip Tickets
    Given Launching Site_oneway
    When Selecting "<from>" "<destination>" "<mon_yr>" "<mon>" "<year>" "<day>" _oneway
    And Selecting "<adult>" "<children>" "<infants>" "<travel_class>" _oneway
    And Searching Cheapest Price
    Then Closing Window

    Examples: 
      | from       | destination | mon_yr     | mon | year | day | adult | children | infants | travel_class |
      | del        | pun         | April 2021 |  04 | 2021 |  24 |     2 |        0 |       0 | Economy      |
      | hyderabada | Jammu       | May 2021   |  05 | 2021 |  12 |     1 |        1 |       0 | Economy      |
