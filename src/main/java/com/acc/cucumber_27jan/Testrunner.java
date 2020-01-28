package com.acc.cucumber_27jan;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"json:target/cucumber.json"})
		//features= "Feature"
		//,glue= {"step_definition"}
		
		)//

public class Testrunner {

}
