package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.PersonalInformationPage.*;

public class FillFormPersonalInformation implements Task {
    private List<UtestData> data;

    public FillFormPersonalInformation(List<UtestData> data) {
        this.data = data;
    }

    public static Performable whit(List<UtestData> data) {
        return Tasks.instrumented(FillFormPersonalInformation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrName()).into(INPUT_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(SELECT_YEAR),
                Click.on(DIV_SPOKEN),
                Enter.theValue(data.get(0).getStrSpoken()).into(INPUT_SPOKEN),
                Click.on(NEXT)
        );
    }
}
