package pages;

public class RegistrarPage extends BasePage{

    private String xpathEmail = "//input[@id='emailControl']";
    private String xpathPassword = "//input[@id='passwordControl']";
    private String xpathConfirmarPassword = "//input[@id='repeatPasswordControl']";
    private String xpathdropdownQuestion = "/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-register[1]/div[1]/mat-card[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]";
    private String valueQuestion = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]";
    private String xpathAnswer = "//input[@id='securityAnswerControl']";
    private String buttonRegister = "//button[@id='registerButton']//span[@class='mat-button-wrapper']";
    private String mensajeRegister = "//span[@class='mat-simple-snack-bar-content']";
    private String boton1 = "/html/body/div[1]/div/a";
    private String boton2 = "//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]";

    public RegistrarPage(){
        super(driver);
    }

    
    public void eliminarDistractores(){
        ClickElemento(boton1);
        ClickElemento(boton2);
    }

    public void navegarPaginaRegistrar(){
        NavegarA("https://demo.owasp-juice.shop/#/register");
    }

    public void escribirEmail(String txtEmail){
        Escribir(xpathEmail, txtEmail);
    }

    public void escribirPassword(String password){
        Escribir(xpathPassword, password);
    }

    public void confirmarPassword(String confirmPassword){
        Escribir(xpathConfirmarPassword, confirmPassword);
    }

    public void clickMatSelect(){
        ClickElemento(xpathdropdownQuestion);
    }

    public void elegirQuestionValor(){
        SelectFromDropdownByIndex(valueQuestion, 2);
    }

    public void escribirAnswer(String answer){
        Escribir(xpathAnswer, answer);
    }

    public void clickRegistrar(){
        ClickElemento(buttonRegister);
    }

    public String obtenerMensajeRegistro(){
        return ObtenerTexto(mensajeRegister);
    }
}
