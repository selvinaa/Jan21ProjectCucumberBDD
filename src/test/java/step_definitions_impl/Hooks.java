package step_definitions_impl;

import org.junit.After;
import org.junit.Before;
import util.Driver;

import java.beans.BeanProperty;

public class Hooks {

    @Before
    public void beforeScenario(){
        Driver.getDriver();
    }
    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
}
