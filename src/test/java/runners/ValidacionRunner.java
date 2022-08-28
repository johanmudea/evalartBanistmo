package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/validacion.feature"},
        glue = {"stepsdefinition"}

)

public class ValidacionRunner {
}
