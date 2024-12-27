package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.MainPageSinCuenta;

public class InicioSesionSteps {
    
    MainPageSinCuenta mPageSinCuenta = new MainPageSinCuenta();
    LoginPage loginPage = new LoginPage();

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

}
