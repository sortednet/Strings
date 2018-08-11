package net.sorted.services.strings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/strings")
public class StringsController {

    @GetMapping("reverse")
    public String reverse(@RequestParam String input) {
        String reversed =  (input != null) ? new StringBuilder(input).reverse().toString() : "";
        return reversed;
    }
}
