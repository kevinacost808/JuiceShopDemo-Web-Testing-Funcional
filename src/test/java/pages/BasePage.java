package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    //Cerrar navegador
    public void CerrarNavegador(){
        driver.quit();
    }

    //Navegar a las paginas
    public void NavegarA(String url){
        driver.get(url);
    }

    //Buscar elementos
    public WebElement BuscarElementos(String localizador){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(localizador)));
    }

    //Hacer click en el elemento
    public void ClickElemento(String localizador){
        BuscarElementos(localizador).click();
    }

    //Darle click a un texto que contiene un link
    public void ClickLinkTexto(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    //Escribir
    public void Escribir(String localizador, String texto){
        BuscarElementos(localizador).clear();
        BuscarElementos(localizador).sendKeys(texto);
    }

    //Enviar elemento
    public void EnviarElemento(String localizador){
        BuscarElementos(localizador).submit();
    }

    //Dropdown
    //Por Valor
    public void SelectFromDropdownByValue(String localizador, String value){
        //Obtener toda la lista
        Select dropdown = new Select(BuscarElementos(localizador));

        //Seleccionar uno por la lista
        dropdown.selectByValue(value);
    }

    //Por Index
    public void SelectFromDropdownByIndex(String localizador, int index){
        //Obtener toda la lista
        Select dropdown = new Select(BuscarElementos(localizador));

        //Seleccionar uno por la lista
        dropdown.selectByIndex(index);
    }

    //Obtener la cantidad de opciones
    public int dropdownSize(String localizador){
        //Obtener toda la lista
        Select dropdown = new Select(BuscarElementos(localizador));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

    //get values the a dropdown
    public List<String> getDropdownValues(String localizador) {
        Select dropdown = new Select(BuscarElementos(localizador));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
            System.out.println(values);
        }
 
        return values;
 
    }
}
