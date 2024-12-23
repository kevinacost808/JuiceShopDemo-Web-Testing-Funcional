Feature: Registro de usuario

    Como visitante de la tienda en linea,
    quiero registrarme en el sistema,
    para realizar las compras 

    Scenario: Registrar usuario exitoso
        Given El usuario está en la pagina de registro
        When Ingresa email "Erika@gmail.com"
        And Ingresa password valido "ErikaMilagros14"
        And Confirma password "ErikaMilagros14"
        When Selecciona pregunta
        And Ingresa Answer "Luz"
        And Hace click en el boton "Register"
        Then El sistema muestra mensaje de exito "Registration completed successfully. You can now log in."
