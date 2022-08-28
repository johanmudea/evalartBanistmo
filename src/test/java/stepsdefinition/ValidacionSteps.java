package stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import question.ValidarQuestion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static task.Validar.validar;
;
import static util.OpenLandingPage.openLandingPage;

public class ValidacionSteps extends Setup {

    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() {

        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @When("add items to cart")
    public void addItemsToCart() {

        theActorInTheSpotlight()
                .attemptsTo(validar()

        );

    }

    @Then("the user will see the value of remaining item")
    public void theUserWillSeeTheValueOfRemainingItem() {



        String string =  ValidarQuestion.validarQuestion().answeredBy(theActorInTheSpotlight());
        String str =  string.substring(1);
        Double strInt = Double.parseDouble(str);

        System.out.println( "++++++ " + strInt.intValue());

        Assert.assertNotEquals(400,strInt.intValue());
        Assert.assertTrue(strInt.intValue()<400);


    }


}
