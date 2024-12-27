package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.MainPageConCuenta;
import pages.MainPageSinCuenta;

public class InicioSesionSteps {
    
    MainPageSinCuenta mPageSinCuenta = new MainPageSinCuenta();
    LoginPage loginPage = new LoginPage();
    MainPageConCuenta mPageConCuenta = new MainPageConCuenta();

    @Given("El usuario está en la página principal")
    public void navegarPaginaPrincipal(){
        mPageSinCuenta.navegarPaginaPrincipal();
        mPageSinCuenta.eliminarDistractores();
    }

    @When("Seleccion Account")
    public void clickAccount(){
        mPageSinCuenta.clickCuenta();
    }

    @And("Selecciona Login")
    public void clickLogin(){
        mPageSinCuenta.clickLogin();
    }

    @When("Ingresa Email {string}")
    public void ingresarEmail(String email){
        loginPage.escribirEmail(email);
    }

    @And("Ingresa password {string}")
    public void ingresarPassword(String password){
        loginPage.escribirPassword(password);
    }

    @And("Hace click en el boton Log in")
    public void seleccionarBtnLogin(){
        loginPage.clickBtnLogin();
    }

    @And("Hace click en Account")
    public void clickAccountCuenta(){
        mPageConCuenta.clickCuenta();
    }

    @Then("El sistema muestra panel principal el email del usuario {string}")
    public void verificarEmail(String emailEsperado){
        String emailActual = mPageConCuenta.extraerEmail();
    
        assertEquals(emailEsperado, emailActual);
    }

}
