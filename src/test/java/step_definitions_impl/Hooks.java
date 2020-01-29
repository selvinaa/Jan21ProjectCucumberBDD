package step_definitions_impl;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

import java.beans.BeanProperty;

public class Hooks {

    public static Scenario currentScenario;

    @Before
    public void beforeScenario(Scenario scenario){
        Driver.getDriver();
        currentScenario = scenario;
    }

    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
}
