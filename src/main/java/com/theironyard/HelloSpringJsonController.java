package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macbookair on 11/9/15.
 */
@RestController
public class HelloSpringJsonController {
    @RequestMapping("/person.json")
    public Person person(
             @RequestParam(defaultValue = "Ricky") String name,
             @RequestParam(defaultValue = "Boston") String city,
             @RequestParam(defaultValue = "65") Integer age)
    {
        return new Person(name,city,age);
    }
}
