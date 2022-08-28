package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.Validar;

public class ValidarQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return (Validar.PRICE.resolveFor(actor).getText());

    }


    public static ValidarQuestion validarQuestion(){
        return new ValidarQuestion();
    }



}
