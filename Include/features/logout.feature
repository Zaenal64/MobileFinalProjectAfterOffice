Feature: Tombol logout berfungsi

  Scenario Outline: User dapat tap button logout dan diarahkan ke halaman login
    Given User input "<username>", "<password>" dan tap button login
    When User berada pada halaman dashboard
    And User tap tombol logout
    Then User berhasil logout, diarahkan ke halaman login

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
