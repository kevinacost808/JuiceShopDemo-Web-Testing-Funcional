package pages;

public class LoginPage extends BasePage {
    
    private String txtEmail = "//input[@id='email']";
    private String txtPassword = "//input[@id='password']";
    private String btnLogin = "//span[@class='mat-button-wrapper']//mat-icon[@role='img'][normalize-space()='exit_to_app']";
    private String mensajeError = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div[1]";

    public LoginPage(){
        super(driver);
    }

    public void navegarPagina(){
        NavegarA("https://demo.owasp-juice.shop/#/login");
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
