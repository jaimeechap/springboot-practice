package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {


    @RequestMapping(value="", method = RequestMethod.POST)
    @ResponseBody
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        String greeting = "";

        if (name == null) {
            return "World";
        } else if (language.equals("English")) {
            greeting = "Hello,";
        } else if (language.equals("Spanish")) {
            greeting = "Hola,";
        } else if (language.equals("French")) {
            greeting = "Bonjour,";
        } else if (language.equals("Italian")) {
            greeting = "Bungiorno,";
        } else if (language.equals("German")) {
            greeting = "Hallo,";
        }
        return greeting + " " + name;
    }


    @RequestMapping(value="form", method= RequestMethod.GET)
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to hello
                "<input type='text' name='name'>" +
                "<form action='lang' method='post'>" +
                "<select name ='language' id='lang-select'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='French' >French</option>" +
                "<option value='English'>English</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='German'>German</option>" +
                "<option value='Italian'>Italian</option>" +
                "</select>" +
                "<input type='submit' value='Greet me' method='post'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
