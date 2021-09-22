Feature: Send an email

  Background:
    Given the user logs in
      |email|password|
      |lauramejia245657@correo.itm.edu.co|la-lis3521|

  @PageLoads
  Scenario: Verify that page loads correctly
    Then  He looks at the message Bandeja de entrada

  @SendEmail
  Scenario: Send an email with a text
    When the user sends an email to a contact and log out
      |emailContact|affair|message|
      |mao|PruebaOutlook2|Hola Maurito|
    Then the user sees that the email was PruebaOutlook2

  @SendPowerPointDocument
  Scenario: Send an email with a powerpoint document
    When the user sends an power document to a contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com|powerpoint|Hola Maurito|
    Then it validate that the message powerpoint

  @SendImage
  Scenario: Send an email with a image
    When the user sends a image to a contact and log out
      |emailContact|affair|
      |mao.men2a@hotmail.com|image|
    Then the user look the email image

  @SendEvent
  Scenario: Send an event to a contact
    When the user send a event to a contact and log out
    |emailContact|affair|message|
    |mao.men2a@hotmail.com|Event|Te cito al destino|
    Then the user look was event

  @SendEmailTwoContact
  Scenario: Send an email to two contacts
    When the user sends an email to two contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co|Prueba outlook|los extraño|
    Then he user look email PruebaOutlook

  @SendPowerTwoContact
  Scenario: Send an powerpoint document to two contacts
    When the user sends an powerpoint document to two contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co|documentopowerpoint|los extraño|
    Then the user validates the message documentopowerpoint

  @SendImageTwoContact
  Scenario: Send an email with a git to two contacts
    When the user sends an image to two contact and log out
      |emailContact|affair|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co|Image2|
    Then he validates the message Image2

  @SendEventTwo
  Scenario: Send an event to a two contact
    When the user send a event to two contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co|event2|Te cito al destino|
    Then the user validates the email was event2

  @SendEmailThreeContact
  Scenario: Send an email to three contacts
    When the user sends an email to three contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co,esteban-0623@hotmail.com|Prueba outlook3|los extraño|
    Then he validates the email was PruebaOutlook3

  @SendPowerThreeContact
  Scenario: Send an powerpoint document to three contacts
    When the user sends an powerpoint document to three contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co,esteban-0623@hotmail.com|documentopowerpoint3|los extraño|
    Then the user validates was documentopowerpoint3

  @SendEventThreeContact
  Scenario: Send an event to three contacts
    When the user sends an event to three contact and log out
      |emailContact|affair|message|
      |mao.men2a@hotmail.com, paularamirez31865@correo.itm.edu.co, esteban-0623@hotmail.com|Evento3|los extraño|
    Then he validates was Evento3

  @SendImageThreeContact
  Scenario: Send an email with a git to three contacts
    When the user sends an image to three contact and log out
      |emailContact|affair|
      |mao.men2a@hotmail.com,paularamirez31865@correo.itm.edu.co, esteban-0623@hotmail.com|Image3|
    Then it is validated that the email was sent Image3