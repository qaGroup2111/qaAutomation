package testRunners;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature"
        ,glue={"src/main/stepDefinition"}
)
public class TestRunner {

}
