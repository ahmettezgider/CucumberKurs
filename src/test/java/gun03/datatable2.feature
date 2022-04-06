Feature: datatable map

  Scenario: map islemleri

    # sol sütun keyler, sag sütun value'lar
    # table.asMap() olarak alinir
    Given map birinci yontem
      | key     | value |
      | name    | Java  |
      | version | 1.1   |

    # ilk satir keyler, digerleri value'lardir.
    # Ilk satir haric kac satir varsa o kadar map vardir
    # table.asMaps()  olarak alinir
    When map ikinci yontem list of maps
      | name    | surname | age |
      | Ali     | Yilmaz  | 23  |
      | Veli    | Demir   | 33  |
      | Hasan   | Deniz   | 45  |
      | Huseyin | Dag     | 13  |

    When login map ikinci yontem list of maps
      | email                | password   | status |
      | kullanici1@gmail.com | pass1      | 0      |
      | kullanici2@gmail.com | pass2      | 0      |
      | testngkurs@gmail.com | testngkurs | 1      |

