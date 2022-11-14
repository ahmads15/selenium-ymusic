Feature: Explore - Youtube Music

  @Test_1
  Scenario: User play music via search page
    Given Open website Youtube Music
    When User click menu "Explore"
    And User search music "Oasis" in search page
    Then User can see result search and play music

  @Test_2
  Scenario: User can see new releases music
    Given Open website Youtube Music
    When User click menu "Explore"
    And User click menu "New releases"
    Then User can see new releases music


