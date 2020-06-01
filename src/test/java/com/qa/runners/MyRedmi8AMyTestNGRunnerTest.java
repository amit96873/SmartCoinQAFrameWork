
package com.qa.runners;
import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/Redmi_Dual_8A/cucumber"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/Redmi_Dual_8A/cucumber-html-reports"}
        ,features = {"src/test/resources/HomePage.feature"}
        ,glue = {"com.qa.stepdef"}
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = {"@test"}
)
public class MyRedmi8AMyTestNGRunnerTest extends RunnerBase {

}
