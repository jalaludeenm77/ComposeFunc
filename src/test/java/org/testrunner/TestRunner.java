package org.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature\\Compose.feature"},glue = {"org.stepdef"},
plugin = {"pretty", "json:C:\\Users\\new\\GmailCompose\\Testcase\\compose.json"})
public class TestRunner {

}
