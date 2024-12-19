package pages;

import java.util.List;

public class RegistrarPage extends BasePage{

    private String xpathEmail = "//input[@id='emailControl']";
    private String xpathPassword = "//input[@id='passwordControl']";
    private String xpathConfirmarPassword = "//input[@id='repeatPasswordControl']";
    private String xpathdropdownQuestion = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c30-15 ng-star-inserted']";
    private String xpathAnswer = "//input[@id='securityAnswerControl']";
    private String buttonRegister = "//button[@id='registerButton']//span[@class='mat-button-wrapper']";
    private String mensajeRegister = "//span[@class='mat-simple-snack-bar-content']";

    public RegistrarPage(){
        super(driver);
    }

    public void escribirEmail(String txtEmail){
        Escribir(xpathEmail, txtEmail);
    }

    public void escribirPassword(String password){
        Escribir(xpathPassword, password);
    }

    public void repetirPassword(String confirmPassword){
        Escribir(xpathConfirmarPassword, confirmPassword);
    }

    public void elegirQuestionValor(String question){
        SelectFromDropdownByValue(xpathdropdownQuestion, question);
    }

    public void escribirAnswer(String answer){
        Escribir(xpathAnswer, answer);
    }

    public void clickRegistrar(){
        ClickElemento(buttonRegister);
    }

    public void obtenerMensajeRegistro(){
        ObtenerTexto(mensajeRegister);
    }
}
