package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrarPage;

public class RegistroUsuarioSteps{

    RegistrarPage registrarPage = new RegistrarPage();

    @Given("El usuario está en la pagina de registro")
    public void navegarPaginaRegistrar(){
        registrarPage.navegarPaginaRegistrar();
    }

    @When("Ingresa email {string}")
    public void ingresarEmailValido(String email){
        registrarPage.escribirEmail(email);
    }

    @And("Ingresa password valido {string}")
    public void ingresarPasswordvalido(String password){
        registrarPage.escribirPassword(password);
    }

    @And("Confirma password {string}")
    public void confirmarPassword(String confirmarPassword){
        registrarPage.confirmarPassword(confirmarPassword);
    }    

    @When("Selecciona pregunta")
    public void selectQuestion(){
        registrarPage.clickMatSelect();
        registrarPage.elegirQuestionValor();
    }

    @And("Ingresa Answer {string}")
    public void ingresarAnswer(String answer){
        registrarPage.escribirAnswer(answer);
    }

    @And("Hace click en el boton {string}")
    public void clickRegister(){
        registrarPage.clickRegistrar();
    }

    @Then("El sistema muestra mensaje de exito {string}")
    public void mensajeRegister(String mensajeRegisterEsperado){
        String mensajeRegisterActual = registrarPage.obtenerMensajeRegistro();
        assertEquals(mensajeRegisterActual, mensajeRegisterEsperado);
    }


}

