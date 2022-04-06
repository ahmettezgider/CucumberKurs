Feature: datatable feature

  Scenario: datatable as list

    Given user write "Java"

    # tek bir list, türü String
    When user write the followings
      | Java   |
      | C#     |
      | Python |

    # listlerimiz var. List lerin listesi
    When user write the following integers
      | 1 | 11 |
      | 2 | 12 |
      | 3 | 13 |

    # [
    #   [1,11]
    #   [2,12]
    #   [3,13]
    # ]


   # listlerimiz var. List lerin listesi
    When user login as follows
      | kullanici1 | sifre1 | 0 |
      | kullanici2 | sifre2 | 0 |
      | kullanici3 | sifre3 | 1 |
