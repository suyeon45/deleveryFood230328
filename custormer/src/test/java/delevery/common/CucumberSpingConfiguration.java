package delevery.common;

import delevery.CustormerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustormerApplication.class })
public class CucumberSpingConfiguration {}
