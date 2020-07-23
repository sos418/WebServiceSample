package com.example.demo.controller;

import com.example.demo.persistence.entity.UserProfile;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserProfileController {

    private static final String template = "Hello, %s!";
    private static final int AGE = 18;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/profile")
    public UserProfile getProfile(@RequestParam(value = "name", defaultValue = "World") String name){
        return new UserProfile(counter.incrementAndGet(), String.format(template, name), AGE);
    }

    @PostMapping("/profile")
    public UserProfile postProfile(@RequestBody String name){
        return new UserProfile(counter.incrementAndGet(), String.format(template, name), AGE);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request){
        System.out.println("RequestURI: " + request.getRequestURI());
        System.out.println("RequestURL: " + request.getRequestURL());

        return "Success";
    }
}
