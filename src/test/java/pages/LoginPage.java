package pages;

public class LoginPage extends BasePage {
    
    private String txtEmail = "//input[@id='email']";
    private String txtPassword = "//input[@id='password']";
    private String btnLogin = "//span[@class='mat-button-wrapper']//mat-icon[@role='img'][normalize-space()='exit_to_app']";
    private String mensajeError = "";
    private String boton1 = "/html/body/div[1]/div/a";
    private String boton2 = "//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]";

    public LoginPage(){
        super(driver);
    }

    public void navegarPagina(){
        NavegarA("https://demo.owasp-juice.shop/#/login");
    }

    public void eliminarDistractores(){
        ClickElemento(boton1);
        ClickElemento(boton2);
    }

    public void escribirEmail(String email){
        Escribir(txtEmail, email);
    }

    public void escribirPassword(String password){
        Escribir(txtPassword, password);
    }

    public void clickBtnLogin(){
        ClickElemento(btnLogin);
    }

    public String mensajeError(){
        return ObtenerTexto(mensajeError);
    }


}
