@tag
Feature: Multicity Trip Goibibo

  @tag1
  Scenario Outline: Booking Multicity Trip Tickets
    Given Launching Site_multitrip
    When Selecting "<from>" "<destination>" "<mon_yr>" "<mon>" "<year>" "<day>" "<destination2>" "<ret_mon_yr>" "<ret_mon>" "<ret_year>" "<ret_day>" _multitrip
    And Selecting "<adult>" "<children>" "<infants>" "<travel_class>" _multitrip
    And Searching Cheapest Price_multitrip
    Then Closing Window_multitrip

    Examples: 
      | from  | destination | mon_yr    | mon | year | day | destination2 | ret_mon_yr | ret_mon | ret_year | ret_day | adult | children | infants | travel_class |
      | delhi | pune        | July 2021 |  07 | 2021 |  14 | Bangalore    | July 2021  |      07 |     2021 |      28 |     4 |        0 |       0 | Economy      |
