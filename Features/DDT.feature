# search: Lap-top , Potato, Computer, Ipad, iphone, samsung....

  Feature: Testing Multi-Datas

    @DDT
    Scenario Outline: Google Searches
      Given Environemnt is ready
      When got to the Website "https://www.google.com"
      And search "<SearchDatas>" keyword
      Then Close the browser

      Examples:
      | SearchDatas |
      | Lap-top   |
      | Potato    |
      | Computer  |
      | Ipad      |
      |Iphone     |
      |samsung    |


      @DDT2

      Scenario Template: Google Searches3

        Given Environemnt is ready
        When got to the Website 'https://www.google.com'
        And search '<NewSearch>' keyword
        Then Close the browser


        Examples:
        | NewSearch|
        | Lap-top   |
        | Potato    |
        | Computer  |
        | Ipad      |
        |Iphone     |
        |samsung    |









