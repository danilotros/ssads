package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectobase.userinterface.DevicePage.*;
import java.util.List;

public class FillFormDevice implements Task {

    private List<UtestData> data;

    public FillFormDevice(List<UtestData> data) {
        this.data = data;
    }

    public static Performable whit(List<UtestData> data) {
        return Tasks.instrumented(FillFormDevice.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DIV_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(DIV_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(INPUT_VERSION).thenHit(Keys.DOWN,Keys.ENTER),
                Click.on(DIV_LENGUAGE),
                Enter.theValue(data.get(0).getStrLenguage()).into(INPUT_LENGUAGE).thenHit(Keys.ENTER),
                Click.on(DIV_MOVIL),
                Enter.theValue(data.get(0).getStrMovil()).into(INPUT_MOVIL).thenHit(Keys.ENTER),
                Click.on(DIV_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(DIV_OS),
                Enter.theValue(data.get(0).getStrOs()).into(INPUT_OS).thenHit(Keys.ENTER),
                Click.on(NEXT)
        );
    }
}
