package pages;

public class MainPageSinCuenta extends BasePage{

    private String cuenta = "//span[normalize-space()='%s']";
    private String login = "//button[@id='navbarLoginButton']//mat-icon[@role='img'][normalize-space()='exit_to_app']";


    public MainPageSinCuenta(){
        super(driver);
    }

    


}
