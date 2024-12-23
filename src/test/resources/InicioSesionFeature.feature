Feature: Inicio de sesion

    Como Usuario registrado de la tienda,
    quiero acceder a las funciones,
    y realizar compras

    @SesionExitoso
    Scenario: Inicio de sesion exitoso
        Given El usuario está en la página principal
        When Seleccion Account
        And Selecciona Login
        When Ingresa email "kevin@gmail.com"
        And Ingresa password "12345678"
        And Hace click en el boton "Log in"
        And Hace click en "Account"
        Then El sistema muestra panel principal el email del usuario "kevin@gmail.com"