package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static final Target INPUT_NAME=Target.the("nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("email").located(By.id("email"));
    public static final Target SELECT_MONTH=Target.the("mes").located(By.id("birthMonth"));
    public static final Target SELECT_DAY=Target.the("dia").located(By.id("birthDay"));
    public static final Target SELECT_YEAR=Target.the("anio").located(By.id("birthYear"));
    public static final Target DIV_SPOKEN=Target.the("div lenguaje").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]"));
    public static final Target INPUT_SPOKEN=Target.the("lenguaje").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target NEXT=Target.the("boton").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
