#Nombre del proyecto
Katalon demo cura

##Contexto: Katalon demo cura es una página de pruebas, donde se concertan citas medicas.
URL: https://katalon-demo-cura.herokuapp.com/profile.php#login"

##Estrategia
Se realizarán un análisis estático de los requerimientos funciones, seguido se ejecutará unas pruebas de humo para validar el cumplimiento de funcionalidades criticas (eje: Inicio de sesión), se diseñarán casos de pruebas orientados al cumplimiento de los objetivos pactados en el alcance y se realizara la automatización de los casos diseñados previamente.


##Casos de pruebas:


###@Cp01

 `Scenario Outline: Fill out the medical appointment form`
    
    `Given  that the user enter home page`
    When the user is on the home page, login.
      | strUsername   | strPassword   |
      | <strUsername> | <strPassword> |
    And fill out the form to book an appointment
      | strFacility   | strVisitDate   | strComment   |
      | <strFacility> | <strVisitDate> | <strComment> |
    Then check confirmation message <strMessage>`

	  	  
##Alcance

Inicio de sesión

Formaulario de concertar citas

##Herramientas:

Intellij,Jdk(1.8),selenium,serenity,Cucumber,Gkenking

##Patrón de diseño:

ScreemPlay

