package steps;

import io.cucumber.java.en.*;
import pages.MainPageSinCuenta;

public class InicioSesionSteps {
    
    MainPageSinCuenta mPageSinCuenta = new MainPageSinCuenta();

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

}
