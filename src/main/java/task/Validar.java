package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static userinterface.Validar.*;

public class Validar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                Click.on(ITEM1),


                Click.on(ITEM2),

                Scroll.to(CART),
                Click.on(CART),


                Click.on(DELETE),
                Click.on(CART)



        );



    }

    public static Validar validar(){
        return new Validar();
    }
}
