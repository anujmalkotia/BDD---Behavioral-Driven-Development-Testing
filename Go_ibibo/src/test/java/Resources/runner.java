package Resources;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "D:\\BDD_CUCUMBER_SELENIUM\\Go_ibibo\\src\\test\\java\\Feature_files",
		glue = {"TestCases"}
)

public class runner {

}
