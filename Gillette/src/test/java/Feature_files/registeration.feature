Feature: Gillette Website Automation I want to use one Script to automate diffrent websites

  Scenario Outline: Gillette India/Austria/France
    Given Launches appropriate website as per input
    When user provide <Email> and <Password> then login
    Then logout or reset password using email <Email>

    Examples: 
      | Email                   | Password   |
      | ericleshner03@gmail.com | eric12345  |
      | ericleshner03@gmail.com | Qwerty@124 |
