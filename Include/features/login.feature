Feature: Login Menggunakan Data Files Database

  Scenario Outline: Login dengan data dari database berdasarkan baris data
    Given User mengambil kredensial login dari data file baris ke <row_index>
    When User menekan tombol Login
    Then Verifikasi hasil login untuk baris ke <row_index>

    Examples:
      | row_index |
      | 1         |
      | 2         |
      | 3         |
      | 4         |
      | 5         |
      | 6         |
      | 7         |
      | 8         |
