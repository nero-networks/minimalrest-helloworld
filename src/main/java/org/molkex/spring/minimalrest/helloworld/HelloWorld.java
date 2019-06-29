package org.molkex.spring.minimalrest.helloworld;

import io.swagger.annotations.ApiOperation;
import org.molkex.spring.minimalrest.MinimalRestApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    /** This endpoint returns "Hello " + name. */
    @GetMapping("/{name}")
    @ApiOperation(value = "This endpoint returns \"Hello \" + name", nickname = "hello")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

    @SpringBootApplication
    public static class App extends MinimalRestApp {
        public static void main(String[] args) {
            SpringApplication.run(App.class, args);
        }
    }
}
