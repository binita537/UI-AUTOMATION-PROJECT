package com.qaproject.StepDefinitions;

import org.springframework.boot.test.context.SpringBootTest;

import com.qaproject.UiAutomationApplication;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = {UiAutomationApplication.class})
public class Hooks {

}
