#Automator:Jesus David Nieves
Feature:Book a medical appointment

  I as a user
  wish to fill out the form
  to book an appointment.

  @CP1

  Scenario Outline: Fill out the medical appointment form
    Given  that the user enter home page
    When the user is on the home page, login.
      | strUsername   | strPassword   |
      | <strUsername> | <strPassword> |
    And fill out the form to book an appointment
      | strFacility   | strVisitDate   | strComment   |
      | <strFacility> | <strVisitDate> | <strComment> |
    Then check confirmation message <strMessage>

    Examples:
      | strUsername |     strPassword     | strFacility                      |      strVisitDate  | strComment                                 | strMessage                                                          |
      | John Doe    | ThisIsNotAPassword  |Hongkong CURA Healthcare Center   |     23/03/2023     | must be 5 minutes before the appointment  |Please be informed that your appointment has been booked as following:|