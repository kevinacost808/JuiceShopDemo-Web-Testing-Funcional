package pages;

public class MainPageConCuenta extends BasePage{
    
    private String cajaCuenta = "//i[normalize-space()='account_circle']";
    private String cajaEmail = "//button[@aria-label='Go to user profile']//span[contains(text(),'kevin@gmail.com')]";
    private String logout = "//button[@id='navbarLogoutButton']//span[contains(text(),'Logout')]";
    
    public MainPageConCuenta(){
        super(driver);
    }

    public void clickCuenta(){
        ClickElemento(cajaCuenta);
    }

    public String extraerEmail(){
        return ObtenerTexto(cajaEmail);
    }

    public void clickLogout(){
        ClickElemento(logout);
    }
}
