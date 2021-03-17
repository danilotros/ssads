package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectobase.userinterface.AddressPage.*;
import java.util.List;

public class FillFormAddress implements Task {
    private List<UtestData> data;

    public FillFormAddress(List<UtestData> data) {
        this.data = data;
    }

    public static Performable whit(List<UtestData> data) {
        return Tasks.instrumented(FillFormAddress.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(data.get(0).getStrCity()).into(INPUT_CITY),
            Enter.theValue(data.get(0).getStrZip()).into(INPUT_ZIP),
            Click.on(DIV_COUNTRY),
            Enter.theValue(data.get(0).getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.DOWN,Keys.ENTER),
            Click.on(NEXT)

        );
    }
}
