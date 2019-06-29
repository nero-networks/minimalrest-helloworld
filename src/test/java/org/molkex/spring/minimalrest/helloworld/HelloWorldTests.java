package org.molkex.spring.minimalrest.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class HelloWorldTests {
    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void testHello() {
        Assert.assertEquals("Hello JUnit", helloWorld.hello("JUnit"));
    }
}
