package pages;

public class MainPageSinCuenta extends BasePage{

    private String boton1 = "/html/body/div[1]/div/a";
    private String boton2 = "//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]";
    private String cuenta = "//i[normalize-space()='account_circle']";
    private String login = "//button[@id='navbarLoginButton']//mat-icon[@role='img'][normalize-space()='exit_to_app']";


    public MainPageSinCuenta(){
        super(driver);
    }

    public void navegarPaginaPrincipal(){
        NavegarA("https://demo.owasp-juice.shop/#/");
    }

    public void eliminarDistractores(){
        ClickElemento(boton1);
        ClickElemento(boton2);
    }

    public void clickCuenta(){
        ClickElemento(cuenta);
    }

    public void clickLogin(){
        ClickElemento(login);
    }


}
