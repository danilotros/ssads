package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.proyectobase.userinterface.ValidationPage.*;
import java.util.List;

public class FillFormValidation implements Task {
    private List<UtestData> data;

    public FillFormValidation(List<UtestData> data) {
        this.data = data;
    }

    public static Performable whit(List<UtestData> data) {
        return Tasks.instrumented(FillFormValidation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_INFORMED),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY_POLITICS)
        );
    }
}
