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

  @Test_3
  Scenario: User can see top chart from another country
    Given Open website Youtube Music
    When User click menu "Explore"
    And User click menu "Charts"
    And User click dropdown country charts "Brazil"
    Then User can see Top chart from Country "Mc Poze do Rodo"

  @Test_4
  Scenario: User can see LYRICS when play a songs
    Given Open website Youtube Music
    And User search music "Raisa" in search page
    And User click Profile Artist
    And User play music on Songs "Kali Kedua"
    Then User can see LYCRICS music






