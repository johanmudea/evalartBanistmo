package util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.LandingPage;

public class OpenLandingPage implements Task {

    private LandingPage landingPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(landingPage)
        );
    }

    public static OpenLandingPage openLandingPage(){
        return new OpenLandingPage();
    }
}