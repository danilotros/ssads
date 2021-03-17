package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationPage {
    public static final Target INPUT_PASSWORD=Target.the("contrasena").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD=Target.the("confirmar contrasena").located(By.id("confirmPassword"));
    public static final Target CHECK_INFORMED=Target.the("informacion correo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS=Target.the("terminos de uso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY_POLITICS=Target.the("politicas de privacidad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target NEXT=Target.the("complete").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
