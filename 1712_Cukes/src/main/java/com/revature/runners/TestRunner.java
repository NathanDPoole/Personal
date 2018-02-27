package com.revature.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/", tags="iteration2")
public class TestRunner extends AbstractTestNGCucumberTests{

}

//put multiple features/tags in an array
// example
// features={"src/some/file","/src/some/other/file"}