import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\stepit\\qaAutomation\\src\\main\\resources\\features",
        glue = {"stepDefinitions"},
        tags = "@run"
)
public class Runner {
}