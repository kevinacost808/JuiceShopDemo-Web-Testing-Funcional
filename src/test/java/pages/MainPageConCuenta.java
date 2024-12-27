package pages;

public class MainPageConCuenta extends BasePage{
    
    private String cajaCuenta = "//i[normalize-space()='account_circle']";
    private String cajaEmail = "//button[@aria-label='Go to user profile']//span[contains(text(),'kevin@gmail.com')]";

    public MainPageConCuenta(){
        super(driver);
    }

    public void clickCuenta(){
        ClickElemento(cajaCuenta);
    }

    public String extraerEmail(){
        return ObtenerTexto(cajaEmail);
    }
}
