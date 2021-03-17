package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.proyectobase.userinterface.ValidationPage.NEXT;
import java.util.List;

public class Answer implements Question<Boolean> {
    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String txtButton= Text.of(NEXT).viewedBy(actor).asString();

        return data.get(0).getStrTextButton().equals(txtButton);
    }
}
