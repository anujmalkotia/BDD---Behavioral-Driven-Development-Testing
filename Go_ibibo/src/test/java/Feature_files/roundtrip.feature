@tag
Feature: Round Trip Goibibo

  @tag1
  Scenario Outline: Booking Round Trip Tickets
    Given Launching Site_roundtrip
    When Selecting "<from>" "<destination>" "<mon_yr>" "<mon>" "<year>" "<day>" "<ret_mon_yr>" "<ret_mon>" "<ret_year>" "<ret_day>" _roundtrip
    And Selecting "<adult>" "<children>" "<infants>" "<travel_class>" _roundtrip
    And Searching Cheapest Price__roundtrip
    Then Closing Window__roundtrip

    Examples: 
      | from     | destination | mon_yr     | mon | year | day | ret_mon_yr | ret_mon | ret_year | ret_day | adult | children | infants | travel_class |
      | chandiga | goa         | April 2021 |  04 | 2021 |  14 | April 2021 |      04 |     2021 |      28 |     4 |        0 |       0 | Economy      |
